package com.example.practice

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        //Declaring variables
        val txtCondition = findViewById<TextView>(R.id.txtCondition)
        val txtCond = findViewById<TextView>(R.id.txtCond)
        val txtCond1 = findViewById<TextView>(R.id.txtCond1)
        val txtCond2 = findViewById<TextView>(R.id.txtCond2)
        val txtCond3 = findViewById<TextView>(R.id.txtCond3)
        val txtCond4 = findViewById<TextView>(R.id.txtCond4)
        val txtCond5 = findViewById<TextView>(R.id.txtCond5)

        val txtMin = findViewById<TextView>(R.id.txtMin)
        val txtMin1 = findViewById<TextView>(R.id.txtMin1)
        val txtMin2 = findViewById<TextView>(R.id.txtMin2)
        val txtMin3 = findViewById<TextView>(R.id.txtMin3)
        val txtMin4 = findViewById<TextView>(R.id.txtMin4)
        val txtMin5 = findViewById<TextView>(R.id.txtMin5)
        val txtMin6 = findViewById<TextView>(R.id.txtMin6)

        val txtMax = findViewById<TextView>(R.id.txtMax)
        val txtMax1 = findViewById<TextView>(R.id.txtMax1)
        val txtMax2 = findViewById<TextView>(R.id.txtMax2)
        val txtMax3 = findViewById<TextView>(R.id.txtMax3)
        val txtMax4 = findViewById<TextView>(R.id.txtMax4)
        val txtMax5 = findViewById<TextView>(R.id.txtMax5)
        val txtMax6 = findViewById<TextView>(R.id.txtMax6)






        // create the get Intent object
        val intent = intent

        // display the string into textView
        txtMin.text = intent.getStringExtra("Min")
        txtMin1.text = intent.getStringExtra("Min1")
        txtMin2.text = intent.getStringExtra("Min2")
        txtMin3.text = intent.getStringExtra("Min3")
        txtMin4.text = intent.getStringExtra("Min4")
        txtMin5.text = intent.getStringExtra("Min5")
        txtMin6.text = intent.getStringExtra("Min6")

        txtMax.text = intent.getStringExtra("Max")
        txtMax1.text = intent.getStringExtra("Max1")
        txtMax2.text = intent.getStringExtra("Max2")
        txtMax3.text = intent.getStringExtra("Max3")
        txtMax4.text = intent.getStringExtra("Max4")
        txtMax5.text = intent.getStringExtra("Max5")
        txtMax6.text = intent.getStringExtra("Max6")



        txtCondition.text = intent.getStringExtra("Notes")
        txtCond.text = intent.getStringExtra("Notes1")
        txtCond1.text = intent.getStringExtra("Notes2")
        txtCond2.text = intent.getStringExtra("Notes3")
        txtCond3.text = intent.getStringExtra("Notes4")
        txtCond4.text = intent.getStringExtra("Notes5")
        txtCond5.text = intent.getStringExtra("Notes6")



    }
}