package com.example.ex_2_11

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClicked(view: View) {
        Log.i("tag1", "Button clicked!")
    }

}
