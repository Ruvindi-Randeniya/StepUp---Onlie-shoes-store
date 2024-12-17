package com.example.stepup

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainNew : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_new)

        val accbtn: ImageView = findViewById(R.id.profile)
        accbtn.setOnClickListener {
            val intent = Intent(this@MainNew, Profile::class.java)
            startActivity(intent)
        }

        val homebtn: ImageView = findViewById(R.id.home)
        homebtn.setOnClickListener {
            val intent = Intent(this@MainNew, Home::class.java)
            startActivity(intent)
        }

        val favbtn: ImageView = findViewById(R.id.goal)
        favbtn.setOnClickListener {
            val intent = Intent(this@MainNew, Descrption::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}