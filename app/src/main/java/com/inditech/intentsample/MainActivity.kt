package com.inditech.intentsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var edEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var tvResult: TextView
    private lateinit var tvResult2: TextView
    private lateinit var intentActivity: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edEmail = findViewById(R.id.edEmail)
        edtPassword = findViewById(R.id.edPassword)
        btnLogin = findViewById(R.id.btnLogin)
        tvResult = findViewById(R.id.tvResult)
        tvResult2 = findViewById(R.id.tvResult2)
        intentActivity = Intent(this@MainActivity, HomePage::class.java)

        btnLogin.setOnClickListener {
            tvResult.visibility = View.VISIBLE
            tvResult.text = edEmail.text
            tvResult2.visibility = View.VISIBLE
            tvResult2.text = edtPassword.text

            intentActivity.putExtra(HomePage.EXTRA_EMAIL, edEmail.text.toString())
            intentActivity.putExtra(HomePage.EXTRA_PASSWORD, edtPassword.text.toString())

            startActivity(intentActivity)
        }

    }
}