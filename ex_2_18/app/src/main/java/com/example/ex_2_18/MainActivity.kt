package com.example.ex_2_18

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var SkogaGoal = 0.0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        var nameView = findViewById<EditText>(R.id.nameEditText) as EditText
        var name = nameView.getText().toString()
        Log.i("info", "button clicked!")
        Log.i("value", name)
        Toast.makeText(this, "Hello $name", Toast.LENGTH_SHORT).show()
    }

    fun onClickFlip(view: View) {
        var imageView = findViewById<ImageView>(R.id.imageView) as ImageView
        imageView.animate().alpha(SkogaGoal).setDuration(2000L)
        var imageView2 = findViewById<ImageView>(R.id.imageView2) as ImageView
        imageView2.animate().alpha(1.0f - SkogaGoal).setDuration(2000L)
        SkogaGoal = 1.0f - SkogaGoal
    }
}