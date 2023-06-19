package com.example.extendedproject

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class Imagebutton : AppCompatActivity() {
    lateinit var number1: EditText
    lateinit var number2: EditText
    lateinit var Image: ImageButton
    lateinit var multiply:Button
    lateinit var subtract:Button
    lateinit var quotient:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagebutton)

        number1 = findViewById(R.id.num1)
        number2 = findViewById(R.id.num2)
        Image = findViewById(R.id.imgbtn)
        multiply = findViewById(R.id.button17)
        subtract= findViewById(R.id.button18)
        quotient= findViewById(R.id.button19)


        Image.setOnClickListener {
            if (number1.text.toString().isEmpty() || number2.toString().isEmpty()) {
                Toast.makeText(applicationContext, "enteer both nos", Toast.LENGTH_LONG).show()
            } else {
                var num1 = Integer.parseInt(number1.text.toString())
                var num2 = Integer.parseInt(number1.text.toString())
                Toast.makeText(
                    applicationContext,
                    "sum of the numbers is" +(num1+num2),
                    Toast.LENGTH_LONG
                ).show()

            }

        }
         //multiply
        multiply.setOnClickListener {
            if (number1.text.toString().isEmpty() || number2.toString().isEmpty()) {
                Toast.makeText(applicationContext, "enteer both nos", Toast.LENGTH_LONG).show()
            } else {
                var num1 = Integer.parseInt(number1.text.toString())
                var num2 = Integer.parseInt(number1.text.toString())
                Toast.makeText(
                    applicationContext,
                    "multiplication of the numbers is" +(num1*num2),
                    Toast.LENGTH_LONG
                ).show()

            }






        }

        //subtract
        subtract.setOnClickListener {
            if (number1.text.toString().isEmpty() || number2.toString().isEmpty()) {
                Toast.makeText(applicationContext, "enteer both nos", Toast.LENGTH_LONG).show()
            } else {
                var num1 = Integer.parseInt(number1.text.toString())
                var num2 = Integer.parseInt(number1.text.toString())
                Toast.makeText(
                    applicationContext,
                    "multiplication of the numbers is" +(num1-num2),
                    Toast.LENGTH_LONG
                ).show()

            }

       }
    }
}