package com.outofbounds85.spotifyapiattempt

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val HOST_FRAGMENT: Int = 1
    val JOIN_FRAGMENT: Int = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //actionBar.hide()

        val intent = Intent(this,ConnectingActivity::class.java)

        btnHostGame.setOnClickListener {
            intent.putExtra("value", HOST_FRAGMENT)
            startActivity(intent)
        }

        btnJoinGame.setOnClickListener {
            intent.putExtra("value", JOIN_FRAGMENT)
            startActivity(intent)
        }
    }
}
