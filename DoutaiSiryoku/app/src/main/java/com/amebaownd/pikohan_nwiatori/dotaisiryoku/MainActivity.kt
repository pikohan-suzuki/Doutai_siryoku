package com.amebaownd.pikohan_nwiatori.dotaisiryoku

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val easy = findViewById<Button>(R.id.easy_button).setOnClickListener(onClickListener)
        val middle =findViewById<Button>(R.id.middle_button).setOnClickListener(onClickListener)
        val hard = findViewById<Button>(R.id.hard_button).setOnClickListener(onClickListener)
        val custom = findViewById<Button>(R.id.custom_button)
        val setting = findViewById<Button>(R.id.setting_button)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode==101 && resultCode== Activity.RESULT_OK){

        }
    }
    private fun goToGame(num:Int){
        val intent = Intent(this,GameActivity::class.java)
        intent.putExtra("num",num)
        startActivityForResult(intent,101)
    }

    private fun goToSetting(){

    }
    private val onClickListener = View.OnClickListener {
        when(it.id){
            R.id.easy_button->{
                goToGame(10)
            }
            R.id.middle_button->{
                goToGame(15)
            }
            R.id.hard_button->{
                goToGame(20)
            }
            R.id.custom_button->{
//                goToGame()
            }
            R.id.setting_button->{
                goToSetting()
            }
        }
    }



}
