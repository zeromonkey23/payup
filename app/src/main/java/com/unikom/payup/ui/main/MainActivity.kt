package com.unikom.payup.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.unikom.payup.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavView.background = null
        bottomNavView.menu.getItem(2).isEnabled = false
    }
}