package com.example.kotlinsample.activity

import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.kotlinsample.AbstractProjectBaseActivity
import com.example.kotlinsample.R

class SplashScreenActivity : AbstractProjectBaseActivity() {
    // Splash screen timer
    private val SPLASH_TIME_OUT = 7000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //        Transparent Status Bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            window.statusBarColor = Color.TRANSPARENT
        }
        setContentView(R.layout.activity_splash_screen)


        Handler().postDelayed({
            startLeftAnimatedActivity(Intent(applicationContext, MainActivity::class.java))
//            if (userId != "") {
//                startAnimatedActivity(Intent(applicationContext, DashboardActivity::class.java))
//            } else {
//                startAnimatedActivity(Intent(applicationContext, LoginActivity::class.java))
//            }
        }, SPLASH_TIME_OUT.toLong())
    }



}
