package com.example.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.practice.R.id.btnClose

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Deaclaring variables
        val btnClose = findViewById<Button>(btnClose)
        val btnNext = findViewById<Button>(R.id.sca)

        //Closing application
        btnClose.setOnClickListener{
            finish()

        }
        //Navigating to the next page
        btnNext.setOnClickListener {
            intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

    }
}