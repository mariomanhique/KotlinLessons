package com.example.lkotlin.oop.inheritance

open class Car(
    color: String,
    model:String){


    /*
    Inheritance design steps

    1. Look for objects that have common attributes
    2. Design a class that represent a common state or behavior
    3. Decide if the subclasses need behaviours(method implementations) that are specific to that particular subclass.

     eg. Cars and Trucks are vehicle and have common behaviours.
     */
    init {
        if (color == "Green"){
            println("yes is Green")
        } else if(model == "XXX"){
            println("On the Spot")

        }
    }

    fun drive(){
        println("Vruuuuuuuum")
    }

    open fun speed(){
        println("1200 km/h")
    }



}

class Track (name:String): Car("Green","XXX"){

    override fun speed() {
//        super.speed()
        println("2000 km/h")
    }
}

fun main(){

    var track = Track("Track Name")

    track.drive()
    track.speed()


}