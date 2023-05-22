package com.example.lkotlin


fun main(){

    val number=4
    val isEven = if(number%2==0) "Number is even" else "Number is odd"

    println(isEven)

    println("Please input a number")

    val input= readLine()?:""

    if(input.length==1){
        println("It has only one digit")
    }else{
        println("It has only more than one digit")

    }

    //When

}
