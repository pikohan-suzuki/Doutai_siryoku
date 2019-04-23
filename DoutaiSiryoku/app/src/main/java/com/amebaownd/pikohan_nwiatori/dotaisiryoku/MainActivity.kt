package com.amebaownd.pikohan_nwiatori.dotaisiryoku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val asdf = findViewById<Button>(R.id.easy_button)
        asdf.setOnClickListener(onClickListener)
        val adsfg =findViewById<Button>(R.id.middle_button)
        adsfg.setOnClickListener(onClickListener)
    }

    private val onClickListener = View.OnClickListener {
        Log.d("aaaaaaa",it.id.toString())
    }

}
