package com.unikom.payup.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.unikom.payup.R
import com.unikom.payup.ui.quota.QuotaActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavView.background = null
        bottomNavView.menu.getItem(2).isEnabled = false
        mobileQuotaBtn.setOnClickListener {
            onClickTransactionType();
        }
    }

    private fun onClickTransactionType() {
        val quotaActivity = Intent(this, QuotaActivity::class.java)
        startActivity(quotaActivity)
    }
}