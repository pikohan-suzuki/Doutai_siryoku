package com.amebaownd.pikohan_nwiatori.dotaisiryoku

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.SeekBar

class SettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_setting)

        val numSeekBar = findViewById<SeekBar>(R.id.num_seekBar)
        val returnButton = findViewById<Button>(R.id.return_button).setOnClickListener{
                intent.putExtra("num",numSeekBar.progress)
                finishActivity(Activity.RESULT_OK)
        }
    }
}