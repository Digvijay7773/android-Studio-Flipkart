package com.example.flipkar_clone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class language : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)

        val btn5 = findViewById<Button>(R.id.button2)
        btn5.setOnClickListener {

            startActivity(Intent(this, loginpage::class.java))

            val btn6 = findViewById<Button>(R.id.btnhindi)
            btn6.setOnClickListener {
                Toast.makeText(this, "Plzz press English", Toast.LENGTH_LONG).show()

                val btn7 = findViewById<Button>(R.id.btnchina)
                btn7.setOnClickListener {
                    Toast.makeText(this, "Plzz press English", Toast.LENGTH_LONG).show()
                }

            }
        }
    }
}