package com.example.ex_2_11

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClicked(view: View) {
        var name = findViewById(R.id.editTextName) as EditText
        var password = findViewById(R.id.editTextPwd) as EditText
        Log.i("tag1", "Button clicked!")
        Log.i("values", name.getText().toString())
        Log.i("values", password.getText().toString())
    }
}