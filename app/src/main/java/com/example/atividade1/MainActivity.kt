package com.example.atividade1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("LOGTESTE ONCREATE OK")
        setContentView(R.layout.main_activity)
    }
    override fun onStart() {
        super.onStart()
        println("LOGTESTE ONSTART OK")
    }


    override fun onResume() {
        super.onResume()
        println("LOGTESTE ONRESUME OK")
    }

    override fun onPause() {
        super.onPause()
        println("LOGTESTE ONPAUSE OK")
    }

    override fun onStop() {
        super.onStop()
        println("LOGTESTE ONSTOP OK")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("LOGTESTE ONDESTROY OK")
    }
}