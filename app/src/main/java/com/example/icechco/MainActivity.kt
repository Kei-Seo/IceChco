package com.example.icechco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import  kotlinx.android.synthetic.main.activity_login.*
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        LinearLayout_login.setOnClickListener {
            val intent = Intent(this, Login_resultActivity::class.java)
            startActivity(intent)
        }
    }
}