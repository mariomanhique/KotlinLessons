package com.example.lkotlin

fun main(){

    //Kotlin increment

    var dogs =2

    println("I have two dogs ${dogs++}") // it is not going to increment in this line of code!

    println(dogs) //Here the incrementation will take effect!

    //Unless we do as follows, takes effect immediately
    println(++dogs)

    //Operators result type
    //The larger operator holds the result type in an operation.
        /*
        Ex: var c:Double
            var d: Float
            The larger variable will be the result type.
         */

//    println("Insert your balance")
//    val userInput = readLine()?:""
//
//    val INTEREST_PER_YEAR= 1.055
//    var balance = userInput.toDouble()
//
//    var result:Double = balance * INTEREST_PER_YEAR
//
//    for (i in 1..5){
//        balance += (balance * INTEREST_PER_YEAR)
//    }

//    println("Test $balance")

    var numToys=2
    var brNumToys=1
    var toysNotBroken=numToys-brNumToys
    var resul= numToys<5 && toysNotBroken>=1


    println("Will the child get a new toy? $resul")

    var numCows=3
    var milkyCows=1
    var famMembers = 3

    var funding= numCows<=5 && milkyCows>0 && famMembers>=3

    println("Is he getting the funding $funding")




}