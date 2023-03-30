package com.example.calculator1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    lateinit var edit1 : EditText
    lateinit var edit2 : EditText
    lateinit var add : Button
    lateinit var sub : Button
    lateinit var multiply : Button
    lateinit var div : Button
    lateinit var Answer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        edit1 = findViewById(R.id.edit1)
        edit2 = findViewById(R.id.edit2)
        add = findViewById(R.id.add)
        sub = findViewById(R.id.sub)
        multiply = findViewById(R.id.multiply)
        div = findViewById(R.id.div)
        Answer = findViewById(R.id.tvAnswer)



        add.setOnClickListener {

            val res1 = edit1.text.toString().toInt()
            val res2 = edit2.text.toString().toInt()

            addition(res1, res2)

        }

        sub.setOnClickListener {

            val res1 = edit1.text.toString().toInt()
            val res2 = edit2.text.toString().toInt()

            substraction(res1, res2)


        }

        multiply.setOnClickListener {

            val res1 = edit1.text.toString().toInt()
            val res2 = edit2.text.toString().toInt()

            multiply(res1, res2)



        }

        div.setOnClickListener {

            val res1 = edit1.text.toString().toInt()
            val res2 = edit2.text.toString().toInt()

            division(res1, res2)


        }


    }

    private fun substraction(res1: Int, res2: Int) {
        val result = res1 - res2
        Answer.text = result.toString()

    }

    private fun addition(res1: Int, res2: Int) {
        val result = res1 + res2
        Answer.text = result.toString()

    }

    private fun multiply(res1: Int, res2: Int) {
        val result = res1 * res2
        Answer.text = result.toString()

    }

    private fun division(res1: Int, res2: Int) {
        val result = res1 / res2
        Answer.text = result.toString()

    }


}