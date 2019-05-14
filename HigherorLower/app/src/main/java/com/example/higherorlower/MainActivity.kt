package com.example.higherorlower

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    // generate final number
    var finalNumber = Random.nextInt(1, 20)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {

        var msg = ""

        // get number from user
        Log.i("info", "button clicked")
        var guessNumberView = findViewById<EditText>(R.id.editText)
        var guessNumberInt = Integer.parseInt(guessNumberView.getText().toString())

        if (guessNumberInt < finalNumber) {
            msg = "Too low"
        } else if (guessNumberInt > finalNumber) {
            msg = "Too high"
        } else {
            msg = "You got it!"
        }

        // send toast
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

    }
}
