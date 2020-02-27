package com.lukaslechner.memoryleakexample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class LeakingActivity: AppCompatActivity() {

    private inner class Listener : GlobalSingletonListener {
        override fun onEvent() { }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaking)

        GlobalSingleton.listeners.add(Listener())
    }

    override fun onDestroy() {
        Log.d("LeakingActivity", "onDestroy() called in $this")
        super.onDestroy()
    }
}