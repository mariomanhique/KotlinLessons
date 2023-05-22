package com.example.lkotlin

fun main(){
    val animal="Dog"
    var resultAction =""

//    when(animal){
//        "Cat"-> {
//            action="pet it"
//        }
//        "Dog"-> {
//            action="feed it"
//        }
//        else -> {
//            action = "Google it"
//        }
//    }

    resultAction = when(animal){
        "Cat"-> {
            "pet it"
        }
        "Dog"-> {
            "feed it"
        }
        else -> {
            "Google it"
        }
    }

    println(resultAction)

    var result =""
    val number=2345

    when(number%2){
        0 -> result="Number is even"
        1 -> result="Number is odd"
    }

    println(result)

//    val input= readLine()?:""
//
//    val meals=input.toInt()
//
//    when(meals){
//        in 1..2 -> println("You should increase the amount of meals")
//        3 -> println("Perfect")
//        in 4..5 -> println("You should decrease the amount of meals")
//        else -> println("")
//    }

    val name= readLine()?:""


    when(name[0]){

        'A','B','C' -> println("Hi A to C")
        in 'D'..'F' -> println("Hi D to F")
        else -> println("Hi")

    }
}