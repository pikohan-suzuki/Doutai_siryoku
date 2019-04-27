package com.amebaownd.pikohan_nwiatori.dotaisiryoku

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.SeekBar

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        val numSeekBar = findViewById<SeekBar>(R.id.num_seekBar)
        numSeekBar.progress = intent.getIntExtra("num", 0)
        val returnButton = findViewById<Button>(R.id.return_button)
        returnButton.setOnClickListener {
            val intentSetting = Intent()
            intentSetting.putExtra("num", numSeekBar.progress)
            setResult(Activity.RESULT_OK,intentSetting)
            finish()
        }
    }
}