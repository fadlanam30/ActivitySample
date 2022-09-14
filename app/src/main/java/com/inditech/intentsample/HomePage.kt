package com.inditech.intentsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomePage : AppCompatActivity() {

    companion object {
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PASSWORD = "extra_password"
    }

    private lateinit var tvResultRec: TextView
    private lateinit var tvResultRec2: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        tvResultRec = findViewById(R.id.tvResultRec)
        tvResultRec2 = findViewById(R.id.tvResultRec2)

        val email = intent.getStringExtra(EXTRA_EMAIL)!!
        val password = intent.getStringExtra(EXTRA_PASSWORD)!!

        tvResultRec.setText("Email : $email")
        tvResultRec2.setText("Password : $password")
    }
}