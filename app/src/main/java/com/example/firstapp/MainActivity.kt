package com.example.firstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.firstapp.Perser.Perser

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 以下オリジナル処理
        val button = findViewById<Button>(R.id.calculate)

        button.setOnClickListener {
            // バリデーション
            var isValid = true
            
            val expressionEditText = findViewById<EditText>(R.id.expression)
            val expressionText = expressionEditText.text.toString()

            if (expressionText.isEmpty()) {
                // 計算式が未入力
                expressionEditText.error = getString(R.string.expression_error)
                isValid = false
            }

            if (isValid) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("expression",expressionText)
                val result = Perser(expressionText).expr().toString();
                intent.putExtra("result",result)
                startActivity(intent)
            }
        }
    }
}