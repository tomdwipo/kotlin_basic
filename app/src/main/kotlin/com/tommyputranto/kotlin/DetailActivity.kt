package com.tommyputranto.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val bundle : Bundle? = intent.extras
        if (bundle != null){
            total_number.setText(""+bundle.get("data"))
        }
    }
}
