package com.example.kotlinsample.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinsample.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out)
    }
}
