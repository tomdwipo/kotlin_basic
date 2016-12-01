package com.tommyputranto.kotlin

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logic()
    }
    fun logic(){

        plus_one.setOnClickListener {
            number  = number + 1
            setNumberToText(""+number)
        }
        plus_two.setOnClickListener {
            number = number + 2
            setNumberToText(""+number)
        }
        plus_three.setOnClickListener {
            number = number + 3
            setNumberToText(""+number)
        }
        reset.setOnClickListener {
            number = 0
            setNumberToText(""+number)
        }
        detail.setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java).apply {
                putExtra("data",""+number)
            })
        }
    }
    fun setNumberToText(number: String){
        number_txt.setText(number)
    }
}
