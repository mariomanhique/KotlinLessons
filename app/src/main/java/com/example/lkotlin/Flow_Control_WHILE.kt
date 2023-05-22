package com.example.lkotlin

fun main(){


  var fineshed=false

      do {
        val input = readLine()?:"0"
        var num=input.toInt()

        var fatorial=1
        var counter=1

        while(counter<=num){

          fatorial *= counter

          counter++

        }

        if (fatorial<3000000){
          println(fatorial)
        }else{
          println(fatorial)
          fineshed=true
        }

      }while (!fineshed)



}