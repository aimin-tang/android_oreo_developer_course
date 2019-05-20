package com.example.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var nextPlayer = 0
    var statusList = arrayListOf<Int>()
    var endGame = arrayListOf<List<Int>>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        statusList.addAll(listOf(-1, -1, -1, -1, -1, -1, -1, -1, -1))
        endGame.addAll(
            listOf(
                listOf(0, 1, 2), listOf(3, 4, 5), listOf(6, 7, 8), listOf(0, 3, 6),
                listOf(1, 4, 7), listOf(2, 5, 8), listOf(0, 4, 8), listOf(2, 4, 6)
            )
        )
    }

    fun onClickCell(view: View) {
        Log.i("info", "cell clicked!")
        var stoneView = view as ImageView
        var tag = Integer.parseInt(stoneView.tag as String)
        if (nextPlayer == 0) {
            stoneView.setImageResource(R.drawable.yellow_circle)
            statusList[tag] = 0
        } else {
            stoneView.setImageResource(R.drawable.red_x)
            statusList[tag] = 1
        }
        stoneView.setTranslationY(-500f)
        Log.i("info", statusList.joinToString())
        stoneView.animate().rotation(360f).translationYBy(500f).setDuration(500)

        var msg = isEnd()
        if (msg != "") {
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
            onNewGame()
            nextPlayer = 0
        } else {
            nextPlayer = 1 - nextPlayer
        }

    }

    fun isEnd(): String {
        var msg: String
        for (triplet in endGame) {
            if (statusList[triplet[0]] == statusList[triplet[1]] && statusList[triplet[0]] == statusList[triplet[2]]
                && statusList[triplet[0]] != -1
            ) {
                if (statusList[triplet[0]] == 0) {
                    return "Yellow wins"
                } else {
                    return "Red Wins"
                }
            }
        }
        return ""
    }

    fun onNewGame() {
        statusList = arrayListOf<Int>()
        statusList.addAll(listOf(-1, -1, -1, -1, -1, -1, -1, -1, -1))
        endGame.addAll(
            listOf(
                listOf(0, 1, 2), listOf(3, 4, 5), listOf(6, 7, 8), listOf(0, 3, 6),
                listOf(1, 4, 7), listOf(2, 5, 8), listOf(0, 4, 8), listOf(2, 4, 6)
            )
        )

        var grid = findViewById<android.support.v7.widget.GridLayout>(R.id.gridLayout)
        for (i in 0..8) {
            var cell = grid.getChildAt(i) as ImageView
            cell.setImageResource(0)
        }
    }
}
