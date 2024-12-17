package com.example.stepup

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        val cartbtn: ImageView = findViewById(R.id.tips)
        cartbtn.setOnClickListener {
            val intent = Intent(this@Profile, MainNew::class.java)
            startActivity(intent)
        }

        val homebtn: ImageView = findViewById(R.id.home)
        homebtn.setOnClickListener {
            val intent = Intent(this@Profile, Home::class.java)
            startActivity(intent)
        }

        val favbtn: ImageView = findViewById(R.id.goal)
        favbtn.setOnClickListener {
            val intent = Intent(this@Profile, Descrption::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.description)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}