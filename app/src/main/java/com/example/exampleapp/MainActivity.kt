package com.example.exampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {

    fun clickFunction(view: View) {
        Log.i("Info", "Button pressed!")
    }

    fun loginFunction(view: View) {
        Log.i("Info", "Login Button pressed")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}