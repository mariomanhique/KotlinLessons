package com.example.lkotlin

fun main(){
//    var test = readLine()
//
//    try{
//        println(test?.toInt())
//
//    }catch (e:Exception){
//        println("Caught ${e.localizedMessage}")
//    }


//    var test2 = readLine()
//
//    try{
//        println(test2?.toInt())
//
//    }catch (e:Exception){
//        println("Caught ${e.localizedMessage}")
//        e.printStackTrace()
//    }finally {
//        println("The execution is completed")// It always gets called, even we get an error!
//    }

//    println()
//    var num = readLine()
//
//    try {
//
//        var convertedNum= num?.toDouble()?.times(0.62)
//        println("The given number times 5: $convertedNum")
//    }catch (e:Exception){
//
//        println("Ocorreu algum error: ${e.localizedMessage}")
//
//    } finally {
//
//        println("Processo finalizado")
//
//    }

    println("What product whoud you like to buy?")
    var productName = readLine()

    println("How many would u like to buy?")
    var numProducts = readLine()

    try {

        var totalPrice= numProducts?.toDouble()?.times(9.99)
        println("The total amount to pay for $productName is: $totalPrice mts")
    }catch (e:Exception){

        println("Ocorreu algum error: ${e.localizedMessage}")

    } finally {

        println("Processo finalizado")

    }
}