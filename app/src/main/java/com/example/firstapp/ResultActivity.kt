package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val expression = intent.getStringExtra("expression")

        val expression_result_label = findViewById<TextView>(R.id.expression_result_label)
        expression_result_label.text = getString(R.string.expression_result_label,expression)

        val result = intent.getStringExtra("result")
//        val result = intent.getStringExtra("expression")

        val expression_result = findViewById<TextView>(R.id.expression_result)
        expression_result.text = getString(R.string.expression_result,result)
    }
}