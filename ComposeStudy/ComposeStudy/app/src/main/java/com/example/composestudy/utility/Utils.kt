package com.example.composestudy.utility

import android.content.Context
import android.content.Intent
import com.example.composestudy.MainActivity
import com.example.composestudy.uiScreens.LoginActivity
import java.util.Timer
import java.util.TimerTask

object Utils {
    fun addDealsAndNext(context: Context){
        Timer().schedule(object : TimerTask() {
            override fun run() {
                var intent= Intent(context, LoginActivity::class.java)
                context.startActivity(intent)
                (context as MainActivity).finish()
            }
        }, 1000)
    }
}