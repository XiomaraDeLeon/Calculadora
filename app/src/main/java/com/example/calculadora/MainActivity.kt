package com.example.calculadora

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numero1 = findViewById<EditText>(R.id.numero1)
        val numero2 = findViewById<EditText>(R.id.numero2)
        val numero3 = findViewById<EditText>(R.id.numero3)
        val numero4 = findViewById<EditText>(R.id.numero4)


        val buttonCalcular = findViewById<Button>(R.id.buttonCalcular)
        buttonCalcular.setOnClickListener {
            suma(num1 = numero1.text.toString().toInt(), num2 = numero2.text.toString().toInt(), num3 = numero3.text.toString().toInt(), num4 = numero4.text.toString().toInt())
            resta(num1 = numero1.text.toString().toInt(), num2 = numero2.text.toString().toInt(), num3 = numero3.text.toString().toInt(), num4 = numero4.text.toString().toInt())
            mulplicacion(num1 = numero1.text.toString().toInt(), num2 = numero2.text.toString().toInt(), num3 = numero3.text.toString().toInt(), num4 = numero4.text.toString().toInt())
            division(num1 = numero1.text.toString().toInt().toDouble(), num2 = numero2.text.toString().toInt()
                .toDouble(), num3 = numero3.text.toString().toInt().toDouble(), num4 = numero4.text.toString().toInt()
                .toDouble()
            )
        }
    }

    private fun division(num1: Double, num2: Double, num3: Double, num4: Double) {
        val resultado = num1 / num2 / num3 / num4
        println("resultado: $resultado")
    }

    private fun mulplicacion(num1: Int, num2: Int, num3: Int, num4: Int) {
        val resultado = num1 * num2 * num3 * num4
        println("resultado: $resultado")
    }

    private fun resta(num1: Int, num2: Int, num3: Int, num4: Int) {
        val resultado = num1 - num2 - num3 - num4
        println("resultado: $resultado")
    }

    private fun suma(num1: Int, num2: Int, num3: Int, num4: Int) {
        val resultado = num1 + num2 + num3 + num4
        println("resultado: $resultado")
    }
}