package com.example.currencyconverter

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    fun convertButton(view: View) {

        var usdExRate = 1.3

        var amount: EditText = findViewById(R.id.amountTextField)

        var convertedAmount = amount.text.toString().toDouble() * usdExRate

        // Round the amount to 2 Decimal places
        var roundedConvertedAmount = "%.2f".format(convertedAmount).toDouble()

        Toast.makeText(this, "£${amount.text} = $${roundedConvertedAmount}", Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}