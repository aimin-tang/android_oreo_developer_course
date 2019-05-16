package com.example.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var nextPlayer = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickCell(view: View) {
        Log.i("info", "cell clicked!")
        var stoneView = view as ImageView
        if (nextPlayer == 0) {
            stoneView.setImageResource(R.drawable.yellow_circle)
        } else {
            stoneView.setImageResource(R.drawable.red_x)
        }
        stoneView.setTranslationY(-500f)
        stoneView.animate().rotation(360f).translationYBy(500f).setDuration(500)

        nextPlayer = 1 - nextPlayer
    }
}
