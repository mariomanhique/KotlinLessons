package com.example.lkotlin.oop.interfaces

import android.view.View
import android.view.View.OnClickListener

interface OnClick {

    fun clickEvent(message:String)

}


class OnClickImpl(var label:String): OnClick{
    override fun clickEvent(message: String) {
        println("Clicked by $label and message: $message")
    }
}

fun main(){

}