package com.example.lkotlin

fun main(){

    val shelter= listOf("Mario","Bob","Kyara")

    for(i in shelter){
        if(i.startsWith("B")){
            continue
        }
        println(i)

    }



}