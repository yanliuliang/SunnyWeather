package com.reader.mysunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication :Application() {
    companion object{
        @SuppressLint("StaticFieldLeak")
        const val TOKEN="MXq2VeMGZqj8PvgI"
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}