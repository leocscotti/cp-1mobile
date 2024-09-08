package com.example.cp1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        val loginButton: Button = findViewById(R.id.loginButton)

        loginButton.setOnClickListener {

            val intent = Intent(this, IntegrantesActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}