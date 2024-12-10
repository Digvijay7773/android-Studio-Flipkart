package com.example.flipkar_clone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class loginpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)

        val btn7 = findViewById<Button>(R.id.loginbtn)
        btn7.setOnClickListener {
            startActivity(Intent(this,sellingpage::class.java))
        }
    }
}