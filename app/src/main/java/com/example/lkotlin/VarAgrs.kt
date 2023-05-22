package com.example.lkotlin

fun main(){
    namesArg(1,3,4) //It does not take a variable list as an argument
}

fun namesArg(vararg names:Int){
    for(name in names){
        var n=0
        n += name
        println(n)
    }


}