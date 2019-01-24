package com.sunnat629.suncha

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.sunnat629.sunchalibs.ToastLibs

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastLibs.toast(this, "This is toast")

    }
}
