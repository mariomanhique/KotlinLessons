package com.example.lkotlin

fun main(){

    val animals= arrayListOf("Cat","Bear")

    for(animal in animals){
        println("Feed the $animal")
    }

    for (i in 1..2){

        val month=when(i){
            1->"January"
            2->"Feb"
            else ->""
        }

        println(month)
    }
    val customers = hashMapOf(Pair("Alice",4),Pair("Mario",10))

    for(purchase in customers){
        println("${purchase.key} had ${purchase.value}")
    }

    val input = readLine()?:"2020"
    var year =input.toInt()

    for(i in 1..12){
        val m=when(i){
            1 ->"January has 31"
            2 -> if(year%4==0) "February has 29 days" else "February has 28 days"
            3 -> "March has 31"
            4 -> "April has 30"
            5 -> "May has 31"
            6 -> "June has 30"
            7 -> "July has 31"
            8 -> "August has 31"
            9 -> "September has 30"
            10 -> "October has 31"
            11 -> "November has 30"
            12 -> "December has 31"
            else ->""
        }
        println(m)
    }


    //Nested for loops

    for(i in 1..5){
        for(e in 1..i){
            print(":)")
        }
    println()
    }

}