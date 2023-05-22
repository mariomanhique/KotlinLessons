package com.example.lkotlin

fun main(){
    println("Please Input Your birthYear")

    val userInput= readLine()?:""

    println("")
    println("Good morning, your age is: ${2023 - userInput.toInt()} ")

    println("Now input a number:")
    val uInput= readLine()?:""  //If readline is null, then fill with an mpty string!

    println("You wrote: ${uInput.toInt() - 5}")




}