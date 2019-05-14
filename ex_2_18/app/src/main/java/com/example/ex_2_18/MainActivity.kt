package com.example.ex_2_18

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        var nameView = findViewById(R.id.nameEditText) as EditText
        var name = nameView.getText().toString()
        Log.i("info", "button clicked!")
        Log.i("value", name)
        Toast.makeText(this, "Hello $name", Toast.LENGTH_SHORT).show()
    }

    fun onClickFlip(view: View) {
        var imageView = findViewById(R.id.imageView) as ImageView
        imageView.setImageResource(R.drawable.skogafoss)
    }
}