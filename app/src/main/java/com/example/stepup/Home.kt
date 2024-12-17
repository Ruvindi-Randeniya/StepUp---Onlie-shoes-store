package com.example.stepup

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val accbtn: ImageView = findViewById(R.id.profile)
        accbtn.setOnClickListener {
            val intent = Intent(this@Home, Profile::class.java)
            startActivity(intent)
        }

        val cartbtn: ImageView = findViewById(R.id.tips)
        cartbtn.setOnClickListener {
            val intent = Intent(this@Home, MainNew::class.java)
            startActivity(intent)
        }

        val favbtn: ImageView = findViewById(R.id.goal)
        favbtn.setOnClickListener {
            val intent = Intent(this@Home, Descrption::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.description)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}