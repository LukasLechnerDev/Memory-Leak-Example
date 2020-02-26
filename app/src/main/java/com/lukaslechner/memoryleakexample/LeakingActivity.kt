package com.lukaslechner.memoryleakexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LeakingActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaking)
    }
}