package com.example.lkotlin

fun main(){

    var items = 5
//    println(items::class.java)  //::class.java help us know the data type oh an specific number!


//    val userInput= readLine()?:""
//    var result = userInput.toInt() * 10.0
//
//    println(result::class.java)

    //Implicit
    val num = 3  // we implicitely know that it is int

    //explicit
    val num1:Double =3.99

    //Type conversion

    val cats =3
    val longCats=cats.toLong()

    println(cats)
    println(longCats::class.java)

    //Converting a small value to a big one is okay, but its not safe to convert a big to a small
    //Eg. Int to Float its okay
    //Eg. Float to Int its not okay


    //Any variable of any datatype can be converted to String!

    println("Please enter a Double number")
    val n = readLine()?:"0"
    val convertedNum=n.toDouble() * 4.14159
    println("The converted number is of type ${convertedNum::class.java}")








}