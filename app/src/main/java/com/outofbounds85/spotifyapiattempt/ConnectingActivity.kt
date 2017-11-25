package com.outofbounds85.spotifyapiattempt

import android.app.Fragment
import android.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ConnectingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connecting)

        val fragmentNo = intent.getIntExtra("value", 3)



        val transaction = supportFragmentManager.beginTransaction()
        val fragment = when(fragmentNo){
            1-> HostFragment()
            2-> JoinFragment()
            else -> print("something went wrong")
        }

        transaction.replace(R.id.fragmetContainer, fragment as android.support.v4.app.Fragment)
        transaction.addToBackStack(null)
        transaction.commit()

    }
}
