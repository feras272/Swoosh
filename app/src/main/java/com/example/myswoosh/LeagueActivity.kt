package com.example.myswoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_league.*
import android.view.View
import android.widget.Toast
import com.example.myswoosh.Model.Player


class LeagueActivity : BaseActivity() {

    var player1 = Player("","")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player1)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

//        nextBtn.setOnClickListener {
//            val skillAct = Intent(this, SkillActivity::class.java)
//            startActivity(skillAct)
//        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            player1 = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onMensClick (view: View) {
        womensToggleBtn.isChecked = false
        coedToggleBtn.isChecked = false
        player1.league = "mens"
    }
    fun onWomensClick (view: View) {
        mensToggleBtn.isChecked = false
        coedToggleBtn.isChecked = false
        player1.league = "womens"
    }
    fun onCoedClick (view: View) {
        womensToggleBtn.isChecked = false
        mensToggleBtn.isChecked = false
        player1.league = "coed"
    }
    fun nextActivity(view: View) {
        if (player1.league != "") {
            val skillAct = Intent(this, SkillActivity::class.java)
            skillAct.putExtra(EXTRA_PLAYER,player1)
            startActivity(skillAct)
        }else {
            Toast.makeText(this,"Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }
}
