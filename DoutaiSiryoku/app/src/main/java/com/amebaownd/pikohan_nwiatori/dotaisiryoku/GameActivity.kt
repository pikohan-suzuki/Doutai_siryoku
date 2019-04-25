package com.amebaownd.pikohan_nwiatori.dotaisiryoku

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

class GameActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_game)

        val num =intent.getIntExtra("num",0)


    }
}