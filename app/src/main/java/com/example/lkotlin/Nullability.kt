package com.example.lkotlin

fun main(){

    /*Nullable*/


    var herName: String ="Lily"
    var hisName:String?=null

    println(herName)
    println(hisName) //This must be initialized to be used

  //  herName=null herName cant be null because we did not use nullable in it!

    //on the other hand, hisName can be assigned to null because of nullable!

    hisName=null //Ok


    /*Safe Calls*/
    var name:String?="Mario"
    println(name?.length?.toString()) //if name is null will return null, if not will return the actual length. And we can chain question marks.

    var name1:String?="Mario"
    name1=null
    println(name?.length?.toString()) //This will still be null!


    //Arithmetic Operations
    //W can use classic operators in null variables
    //We have replacement methods

    /*
    +   = ?.plus()
    -   = ?.minus()
    *   = ?.times()
    /   = ?.div()
    %   = ?.rem()
    * */

    var a:Int?=10

    println(a?.plus(3))
    println(a?.minus(3))
    println(a?.times(3))
    println(a?.div(3))
    println(a?.rem(3))//%

    var nm1:String?="Manhique"
    println(" Substring: ${nm1?.substring(3,6)}")

    var n:Double?=30.0
    n=n?.times(6)

    println("Multiplied ${n?.toFloat()}")

//    val input= readLine()?:""
//
//    var nwNum=input?.toDouble()
//    nwNum=nwNum?.times(7)
//
//    var text:String=nwNum.toString()
//
//    println("Converted String ${text.length}")

    var catName:String?=null
//    catName="mia"

    println((catName?:"No name inserted").length)


    //Non Null Assertions
    //!!. stands for a developer guarantee that the variable is not null
    // But if we are wrong the program will crash
    //So we have to avoid as much as we can

    var dogName:String?=null

//    println(dogName!!.length) //if variable is actually null, we will get a NPE

    dogName ="Luffy"
    println(dogName!!.length) //This one will compile Ok
    val productPrice = 29.99

    println("Enter any numb")
    var insert=readLine()

    var numProducts:Double=insert?.toDouble()?:1.0
    println("Total is ${numProducts * productPrice}") // when we use assertions, we dont need to use replacement methods to perform operations

}