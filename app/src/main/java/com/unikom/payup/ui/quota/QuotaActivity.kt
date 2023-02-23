package com.unikom.payup.ui.quota

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.unikom.payup.R
import com.unikom.payup.databinding.ActivityQuotaBinding
import com.unikom.payup.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_quota.quota1
import kotlinx.android.synthetic.main.activity_quota.quota2
import kotlinx.android.synthetic.main.activity_quota.quota3
import kotlinx.android.synthetic.main.activity_quota.quota4
import kotlinx.android.synthetic.main.activity_quota.quota5
import kotlinx.android.synthetic.main.activity_quota.quota6


class QuotaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuotaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuotaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar3)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(true)
        val submit = binding.submit
        val quota1 = binding.quota1
        val quota2 = binding.quota2
        val quota3 = binding.quota3
        val quota4 = binding.quota4
        val quota5 = binding.quota5
        val quota6 = binding.quota6

        quota1.setOnClickListener {
            onQuotaSelected(it)
        }

        quota2.setOnClickListener {
            onQuotaSelected(it)
        }

        quota3.setOnClickListener {
            onQuotaSelected(it)
        }

        quota4.setOnClickListener {
            onQuotaSelected(it)
        }

        quota5.setOnClickListener {
            onQuotaSelected(it)
        }

        quota6.setOnClickListener {
            onQuotaSelected(it)
        }

        submit.setOnClickListener {
            submitForm()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun onQuotaSelected(item: View) {
        resetSelected()
        item.setBackgroundResource(R.drawable.button_bg)
    }

    private fun resetSelected() {
        quota1.setBackgroundResource(0);
        quota2.setBackgroundResource(0);
        quota3.setBackgroundResource(0);
        quota4.setBackgroundResource(0);
        quota5.setBackgroundResource(0);
        quota6.setBackgroundResource(0);
    }

    private fun submitForm() {
        val welcome = getString(R.string.welcome)
        Toast.makeText(
            applicationContext,
            "$welcome, you are successfully registered",
            Toast.LENGTH_LONG
        ).show()

        val mainActivityIntent = Intent(this, MainActivity::class.java)
        startActivity(mainActivityIntent)
    }
}