package com.example.lkotlin

fun main(){

    val pet=1
    val pet1=""

    val availPets= arrayListOf("Dog","Cat")

    if(pet in 1..10){
        println("I got a pet")
    }

    if(pet1 !in availPets){
        println("I did not get a pet")
    }

    if(availPets.add("horse")){ //Returns a boolean
        println("Horse added")
    }

}