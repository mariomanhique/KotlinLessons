package com.example.lkotlin.oop.extension

fun main(){

    println("Hello, ".append("Mario"))
}



fun String.append(toAppend:String):String{
    toAppend.substring(0,0)
    return this.plus(toAppend.substring(1,toAppend.length-1))
}

//fun Int.toSum(num:String):Int{

//return this.plus()
//}