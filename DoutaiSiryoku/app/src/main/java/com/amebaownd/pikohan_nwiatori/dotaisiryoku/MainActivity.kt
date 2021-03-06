package com.amebaownd.pikohan_nwiatori.dotaisiryoku

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var numberOfNumber =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val easy = findViewById<Button>(R.id.easy_button).setOnClickListener(onClickListener)
        val middle =findViewById<Button>(R.id.middle_button).setOnClickListener(onClickListener)
        val hard = findViewById<Button>(R.id.hard_button).setOnClickListener(onClickListener)
        val custom = findViewById<Button>(R.id.custom_button).setOnClickListener(onClickListener)
        val setting = findViewById<Button>(R.id.setting_button).setOnClickListener(onClickListener)
        val customText = findViewById<TextView>(R.id.custom_text)
        numberOfNumber =readFile(applicationContext,"num")?.toInt() ?: 0
        customText.text= numberOfNumber.toString()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
        if(requestCode==101&&resultCode==Activity.RESULT_OK){

        }
        if(requestCode==102 && resultCode== Activity.RESULT_OK){
            writeFile(applicationContext,"num",intent?.getIntExtra("num",0).toString())
            numberOfNumber= intent?.getIntExtra("num",0)!!
            custom_text.text=numberOfNumber.toString()
        }
    }
    private fun goToGame(num:Int){
        val intent = Intent(this,GameActivity::class.java)
        intent.putExtra("num",num)
        startActivityForResult(intent,101)
    }

    private fun goToSetting(){
        val intent = Intent(this,SettingActivity::class.java)
        intent.putExtra("num",numberOfNumber)
        startActivityForResult(intent,102)
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
                goToGame(numberOfNumber)
            }
            R.id.setting_button->{
                goToSetting()
            }
        }
    }


}
