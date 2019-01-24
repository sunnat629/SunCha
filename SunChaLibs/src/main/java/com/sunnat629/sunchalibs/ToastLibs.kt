package com.sunnat629.sunchalibs

import android.content.Context
import android.view.Gravity
import android.widget.Toast

class ToastLibs {

    companion object {
        private lateinit var toast: Toast

        fun toast(context: Context, message: String){
            Toast.makeText(context.applicationContext, message, Toast.LENGTH_SHORT).show()
        }

        fun toast(context: Context, message: String, duration: Int){
            Toast.makeText(context.applicationContext, message, duration).show()
        }


        fun toastCenter(context: Context, message: String){
            toast = Toast.makeText(context.applicationContext, message, Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
            toast.show()
        }

        fun toastTop(context: Context, message: String){
            toast = Toast.makeText(context.applicationContext, message, Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP, 0, 0)
            toast.show()
        }

        fun toastBottom(context: Context, message: String){
            toast = Toast.makeText(context.applicationContext, message, Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.BOTTOM, 0, 0)
            toast.show()
        }

        fun toastLeft(context: Context, message: String){
            toast = Toast.makeText(context.applicationContext, message, Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.START, 0, 0)
            toast.show()
        }

        fun toastRight(context: Context, message: String){
            toast = Toast.makeText(context.applicationContext, message, Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.END, 0, 0)
            toast.show()
        }
    }
}