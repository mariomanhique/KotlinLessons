package com.example.lkotlin

fun main(){


    val count= mapOf(Pair(1,"One"), Pair(2,"Two"),Pair(3,"Three"))

    println(count.get(2))
    println(count.keys)
    println(count.values)
  //  println(count[2]) //Same

    //When we create a map we have to specify the type of the key and type of the value, since a pair take
    //two arguments

    val count2 = mapOf<Int,String>()

    val hashCount= hashMapOf(Pair(1,"One"),Pair(2,"Two"))
    hashCount.put(3,"Three")
   // hashCount[3]="Three" //This is the sames
    println(hashCount)

    val newMap= mapOf(Pair(4,"Four"),Pair(5,"Five"))
    hashCount.putAll(newMap)
    println(hashCount)

    hashCount.remove(5)
    println(hashCount)

    hashCount.replace(3,"3")  //Only hashMaps have replace method
    println(hashCount)

    hashCount.clear()
    println(hashCount.isEmpty())
    println(hashCount.isNotEmpty())

    val newHash= hashMapOf(Pair(1,"One"),Pair(2,"Two"),Pair(3,"Three"),Pair(4,"Four"))
    println("This HashMap has the size of ${newHash.size}")
    println("And it also contains key 2? ${newHash.containsKey(2)}")
    println("And it also contains value one? ${newHash.containsValue("One")}")

}