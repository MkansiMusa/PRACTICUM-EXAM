package com.example.practice

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.practice.R.id.btnNext

import com.example.practice.R.id.txtMaximum
import com.example.practice.R.id.txtMinimum

@Suppress("IMPLICIT_CAST_TO_ANY")
class MainActivity2 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Declaring variables
        val btnNext =findViewById<Button>(btnNext)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val btnAdd = findViewById<Button>(R.id.btnAdd)

        val txtMinimum = findViewById<EditText>(txtMinimum)
        val txtMaximum = findViewById<EditText>(txtMaximum)



        //Declaring Arrays
        val intMin= arrayListOf<Int>()
        val intMax= arrayListOf<Int>()
        val strWeatherCod= arrayListOf<String>()


        //Clearing the edittexts
        btnClear.setOnClickListener {
            txtMinimum.setText("")
            txtMaximum.setText("")

        }
        btnAdd.setOnClickListener {
            //Checking if user has entered everything that is required

            if (txtMinimum.text.toString().isEmpty()&& txtMaximum.text.toString().isEmpty()){

                Toast.makeText(applicationContext,"Please fill in",Toast. LENGTH_LONG).show()
            }else {
                //Inputing values to arrays
                intMin.add(txtMaximum.text.toString().toInt())
                intMax.add(txtMaximum.text.toString().toInt())
                val i = 0
                val result = when  {
                    intMax.get(0) in 11..25 && intMax.get(0) in 12..25-> "Sunny"
                    intMax.get(0) in -10..5 && intMax.get(0) in 12..25-> "Cold"
                    intMax.get(0) in 6..10 && intMax.get(0) in 12..25-> "Runny"
                    intMax.get(0) in 12..25 && intMax.get(0) in 26..30-> "Hot"



                    intMax.get(1) in 11..25 && intMax.get(1) in 12..25-> "Sunny"
                    intMax.get(1) in -10..5 && intMax.get(1) in 12..25-> "Cold"
                    intMax.get(1) in 6..10 && intMax.get(1) in 12..25-> "Runny"
                    intMax.get(1) in 12..25 && intMax.get(1) in 26..30-> "Hot"


                    intMax.get(2) in 11..25 && intMax.get(2) in 12..25-> "Sunny"
                    intMax.get(2) in -10..5 && intMax.get(2) in 12..25-> "Cold"
                    intMax.get(2) in 6..10 && intMax.get(2) in 12..25-> "Runny"
                    intMax.get(2) in 12..25 && intMax.get(2) in 26..30-> "Hot"



                    intMax.get(3) in 11..25 && intMax.get(3) in 12..25-> "Sunny"
                    intMax.get(3) in -10..5 && intMax.get(3) in 12..25-> "Cold"
                    intMax.get(3) in 6..10 && intMax.get(3) in 12..25-> "Runny"
                    intMax.get(3) in 12..25 && intMax.get(3) in 26..30-> "Hot"



                    intMax.get(4) in 11..25 && intMax.get(4) in 12..25-> "Sunny"
                    intMax.get(4) in -10..5 && intMax.get(4) in 12..25-> "Cold"
                    intMax.get(4) in 6..10 && intMax.get(4) in 12..25-> "Runny"
                    intMax.get(4) in 12..25 && intMax.get(4) in 26..30-> "Hot"

                    intMax.get(5) in 11..25 && intMax.get(5) in 12..25-> "Sunny"
                    intMax.get(5) in -10..5 && intMax.get(5) in 12..25-> "Cold"
                    intMax.get(5) in 6..10 && intMax.get(5) in 12..25-> "Runny"
                    intMax.get(5) in 12..25 && intMax.get(5) in 26..30-> "Hot"

                    intMax.get(6) in 11..25 && intMax.get(5) in 12..25-> "Sunny"
                    intMax.get(6) in -10..5 && intMax.get(5) in 12..25-> "Cold"
                    intMax.get(6) in 6..10 && intMax.get(5) in 12..25-> "Runny"
                    intMax.get(6) in 12..25 && intMax.get(5) in 26..30-> "Hot"
                    else -> {}

                }
                strWeatherCod.add(result.toString())
            }


            btnNext.setOnClickListener {
                //Open new activity
                intent = Intent(this,MainActivity3::class.java)
                //Passing Arrays to next main activity
                intent.putExtra("Min",intMin.get(0))
                intent.putExtra("Min1",intMin.get(1) )
                intent.putExtra("Min2",intMin.get(2) )
                intent.putExtra("Min3",intMin.get(3) )
                intent.putExtra("Min4",intMin.get(4) )
                intent.putExtra("Min5",intMin.get(5) )
                intent.putExtra("Min6",intMin.get(6) )

                intent.putExtra("Max",intMax.get(0) )
                intent.putExtra("Max1",intMax.get(1) )
                intent.putExtra("Max2",intMax.get(2) )
                intent.putExtra("Max3",intMax.get(3) )
                intent.putExtra("Max4",intMax.get(4) )
                intent.putExtra("Max5",intMax.get(5) )
                intent.putExtra("Max6",intMax.get(6) )

                intent.putExtra("Notes",strWeatherCod.get(0) )
                intent.putExtra("Notes1",strWeatherCod.get(1) )
                intent.putExtra("Notes2",strWeatherCod.get(2) )
                intent.putExtra("Notes3",strWeatherCod.get(3) )
                intent.putExtra("Notes4",strWeatherCod.get(4) )
                intent.putExtra("Notes5",strWeatherCod.get(5) )
                intent.putExtra("Notes6",strWeatherCod.get(6) )
                startActivity(intent)
            }


        }

    }
}