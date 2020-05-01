package com.example.myswoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myswoosh.Model.Player
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {


//    var leage:String = player1.league
//    var skill:String = player1.skill



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        var player1 = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
//        player1 = intent.getStringExtra(EXTRA_LEAGUE)
//        var skill = intent.getStringExtra(EXTRA_SKILL)
        searchingForALeague.text = "Looking for ${player1.league} ${player1.skill} league near you..."
        //println(EXTRA_PLAYER)
    }

}
