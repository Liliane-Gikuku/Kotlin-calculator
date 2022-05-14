package com.calc.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var btnPlus: Button
    lateinit var etNumber1: EditText
    lateinit var etNumber2: EditText
    lateinit var tvAnswer: TextView
    lateinit var btnMinus: Button

    lateinit var btnTimes: Button

    lateinit var btnModulus: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPlus = findViewById(R.id.btnPlus)
        tvAnswer = findViewById(R.id.tvAnswer)
        btnMinus=findViewById(R.id.btnMinus)
        btnTimes=findViewById(R.id.btnTimes)
        btnModulus=findViewById(R.id.btnModulus)
        etNumber1 = findViewById(R.id.etNumber1)
        etNumber2 = findViewById(R.id.etNumber2)

        btnPlus.setOnClickListener {
            var number1 = etNumber1.text.toString().toInt()
            var number2 = etNumber2.text.toString().toInt()
            findSum(number1, number2)
        }





            btnMinus.setOnClickListener {
                var number1 = etNumber1.text.toString().toInt()
                var  number2= etNumber2.text.toString().toInt()
                findDiff(number1, number2)
            }


            btnTimes.setOnClickListener {

                var number1 = etNumber1.text.toString().toInt()
                var  number2= etNumber2.text.toString().toInt()
                findProduct(number1, number2)
            }


            btnModulus.setOnClickListener {
                var number1 = etNumber1.text.toString().toInt()
                var  number2= etNumber2.text.toString().toInt()
                findModulus(number1, number2)
            }


        }




    fun findSum(number1: Int, number2: Int) {
        var sum = number1 + number2

        tvAnswer.text = sum.toString()
    }

    fun findDiff(number1: Int, number2: Int) {
        var diff = number1 - number2

        tvAnswer.text = diff.toString()
    }
    fun findProduct(number1: Int, number2: Int) {
        var product = number1 * number2

        tvAnswer.text = product.toString()
    }
    fun findModulus(number1: Int, number2: Int) {
        var modulus = number1 % number2

        tvAnswer.text = modulus.toString()
    }
}

