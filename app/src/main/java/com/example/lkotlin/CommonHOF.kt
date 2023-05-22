package com.example.lkotlin

fun main(){



    //forEach Higher Ordered Function
    var clients= arrayListOf("Mario","Manhique","Ernesto")
    clients.forEach {
           println("Hello $it")
    }

    //filter Higher Ordered Function, it filters by a boolean expression!

    var list= arrayListOf("Mario","Manhique","Ernesto")
    list.filter {
        it.length>5
    }.forEach{
        println("$it s length is bigger")
    }

    var nums= arrayListOf<Int>(1,2,3,4,5)
    nums.filter {
        it.mod(2)==0
    }

    //map Higher Order Function, map allows us to create another list based on the original list and our conditions to each item.
    var mapList= listOf("Mario","Manhique","Ernesto")
    var firstCaracter=mapList.map {
        it.substring(1,4)
    }.forEach{
        println(it)
       } //ou .forEach{it}


  //sortedBy Higher Order Function, sortedBy allows us to sort a list based on certain condition
    var sortedList= listOf("Manhique","Nicolas","Mario","Ernesto")
    var sorted=sortedList.sortedBy { it[it.length-1] }
    println("Last index $sorted")

    //maxBy Higher Order Function, maxBy allows us to get the maximum value in length

    var maxList=listOf("Manhique","Ernesto","Mario","Nicolas").maxBy { it.length }
    println(maxList)

    //minBy Higher Order Function, minBy allows us to get the maximum value in length

    var minList=listOf("Manhique","Ernesto","Mario","Nicolas").minBy { it.length }
    println(minList)

    //HOF has a lot of function


    val ramIntegers= arrayListOf(50,20,23,55,60,980,495,776,89,30,44,85,100,88)
    val subset=ramIntegers.map {
        if(it%2!=0){
            it*2
        }else{
            it/2
        }

    }.filter { it>25 }.forEach { println(it) }

    //Ou
    println(subset)//, ou I could loop the subset the original way.



}

