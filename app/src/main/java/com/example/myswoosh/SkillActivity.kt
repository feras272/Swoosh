package com.example.myswoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myswoosh.Model.Player
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    //var selectedSkill = ""
    lateinit var player1 : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player1 = intent.getParcelableExtra(EXTRA_PLAYER)


    }

    fun onBeginnerClick (view: View) {
        ballerToggleBtn.isChecked = false
        player1.skill = "beginner"
    }

    fun onBallerClick (view: View) {
        beginnerToggleBtn.isChecked = false
        player1.skill = "baller"
    }

    fun onFinishClick(view: View) {
        if(player1.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player1)
            startActivity(finishActivity)
        }else {
            Toast.makeText(this,"Please select a skill.", Toast.LENGTH_SHORT).show()
        }
    }

}



//C:\Users\feras272\Desktop\MySwoosh\app\src\main\res\layout\activity_skill.xml