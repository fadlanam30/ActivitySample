package com.inditech.activitysample

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edEmail = findViewById(R.id.edEmail)
        edtPassword = findViewById(R.id.edPassword)
        btnLogin = findViewById(R.id.btnLogin)
        tvResult = findViewById(R.id.tvResult)
        tvResult2 = findViewById(R.id.tvResult2)

        btnLogin.setOnClickListener {
            tvResult.visibility = View.VISIBLE
            tvResult.text = edEmail.text
            tvResult2.visibility = View.VISIBLE
            tvResult2.text = edtPassword.text
        }

    }
}