package com.example.lkotlin

fun main(){
    val colors=listOf("Blue","Red","Yellow","Yellow",null) // we can have duplicates and null values

    println(colors)

    //If we dont provide no element, we have to specity the data type
    val colorList= listOf<String>()

////////////////////////////////////////////////
    val col:ArrayList<String> = arrayListOf("Blue","Red") //This is Ok
    val colo = arrayListOf("Blue","Red","Blue") //This is Ok
    println(col)
    col.add("Black")
    println("updated $col")
    val moreColors=arrayListOf("Gray","Pink","teal")
    col.addAll(moreColors)
    println("updated again $col")
    col.remove("black") /*Ou*/
    col.removeAt(1)
    col.remove("Blue") //since blue is duplicated, it will remove the first blue only!


    val animal = listOf("Dog","Cat","Cow","Lion","Lion")
    println(animal.size)
    println(animal.contains("Cat"))
    println(animal.contains("Mario"))
    val someAnimals= listOf("Dog","Lion")
    println("Animal contains all ${animal.containsAll(someAnimals)}")
    println(animal.indexOf("Cow"))
    println(animal.lastIndexOf("Lion"))


    val printColors= listOf("Red","Blue","Green")
    val availableColors= listOf("Red","Blue")
    println("Is the printer able to print? ${availableColors.containsAll(printColors)}")



    val customers= arrayListOf("Joao","Mario","Manhique","Nicolas","Mario")
    customers.add("Ernesto")
    val customersToRemove = arrayListOf("Mario","Manhique")
    customers.removeAll(customersToRemove)

    println(customers)
    customers.set(0,"Kiara")
    val subCustomers=customers.subList(1,2)
    println(subCustomers)
    println(customers.isEmpty())



}