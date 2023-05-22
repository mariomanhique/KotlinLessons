package com.example.lkotlin

import java.lang.Integer.parseInt

fun main(){
    var a = 2
    val s1 = "a is $a"
    a =4
    val s2 = "${s1.replace("is","was")},but now is $a"

    println(s2)

    var myPet = "Crocodile"

//    println(myPet.substring(3,6))
    println(myPet.endsWith("le",true))

    //String templates${ }, inside the braces you can calculate, call methods and more.

    checkNullable("20","15")

}

fun checkNullable(arg1:String,arg2:String){

   val x= arg1.toInt()
   val y=parseInt(arg2)

    //toInt and parseInt
    if(x!=null && y!=null){

        println(x * y)

    }else{
        print("The values are not ints")
    }

}



