// Create app which in which user enters a number and is told whether number is TRIANGULAR, SQUARE, BOTH or Neither

package com.example.numbershapes

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.floor
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    fun computeButton(view: View) {

        var usersNumber: EditText = findViewById(R.id.usersNumberTextField)



        if (usersNumber.text.toString().isNullOrEmpty()) {
            toast("Please enter a number")




        } else{
            var usersNumberDouble: Double = usersNumber.text.toString().toDouble()

            val triangle = triangularCalculation(usersNumberDouble)
            val square = squareCalculation(usersNumberDouble)

            Log.i("INFO", square.toString() + triangle.toString())

            if (triangle) {
                toast("Triangular")
            } else if (square) {
                toast("square")
            } else if (square && triangle) {
                toast("Triangular & square")
            } else {
                toast("neither")
            }
        }
    }


    fun triangularCalculation(usersNumberDouble: Double) : Boolean {
        val calcNumber: Double = (8 * usersNumberDouble + 1)
        val squareRoot = sqrt(calcNumber)
        return squareRoot * squareRoot == calcNumber
    }

    fun squareCalculation(usersNumberDouble: Double) : Boolean {
        val squareRoot : Double = sqrt(usersNumberDouble)
        return squareRoot == floor(squareRoot)
    }

    private fun toast (message: String) {
        return Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}