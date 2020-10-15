package com.example.exampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    fun loginFunction(view: View) {

        var usernameInput: EditText = findViewById(R.id.usernameFieldText)
        var passwordInput: EditText = findViewById(R.id.passwordFieldText)

        Log.i("Info", "Login Button pressed")
        Log.i("Username", usernameInput.text.toString())
        Log.i("Password", passwordInput.text.toString())

        Toast.makeText(this, "Welcome back " + usernameInput.text.toString(), Toast.LENGTH_SHORT).show()
    }

    fun switchImageButton(view: View) {
        val image: ImageView = findViewById(R.id.imageViewer)
        image.setImageResource(R.drawable.dog)

        Toast.makeText(this, "Image switched", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}