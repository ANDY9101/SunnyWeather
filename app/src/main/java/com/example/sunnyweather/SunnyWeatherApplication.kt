package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication:Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context:Context

        ///令牌值
        const val TOKEN = "hft3qqrFc37ZfMbj"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}