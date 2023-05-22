package com.example.lkotlin

fun main(){
    val numbers = setOf(6,5,4,6) //it will print unique values

    println(numbers)

    //We can create an mpty set but we need to specify the type!

    val numbers2= setOf<Int>(2,3)

    //We can add null inside a set with nullable if we specify the type, but only one since it takes unique values

    val testNull= setOf(4,null,8,9)
    val testNull2= setOf<Int?>(4,null,8,9)

    println(testNull2)


    //HastSet

    val hasNumbers= hashSetOf(5,3,4,null,7,8,9,)
    val noNumbers = hashSetOf<Int>()

    hasNumbers.add(44)

    val newNumbers = setOf(2,4,5,6)
//    hasNumbers.addAll(newNumbers)
    println(hasNumbers)
    println(noNumbers)

    hasNumbers.remove(44)
    println(hasNumbers)

//    hasNumbers.removeAll(newNumbers )
    println(hasNumbers)

    hasNumbers.retainAll(newNumbers)
    println(hasNumbers) //Will print only the intersection, those that they have in common!

    hasNumbers.clear()
    println(hasNumbers.isEmpty())
    println(hasNumbers.isNotEmpty())




}