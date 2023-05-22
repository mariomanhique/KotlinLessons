package com.example.lkotlin

fun main(){

    var names= arrayListOf("Manhique","Ernesto","Mario")
    val myLambda={ name:String->println("Hello $name")} // This lambda function can be passed as a
    //parameter to other Function, Called  HIGHER ORDER FUNCTION

//    //The calls below do the same thing and achieve the same result
    Hello(names,myLambda) //Ou
    Hello(names){name->println("Hello $name")}// This is the beginner mode
    println("Testing Lambda")
    Hello(names){ name ->
       println(name)
    } //And this is the advanced mode

    Hello(arrayListOf("Manhique","Ernesto","Mario")){name:String->println("Hello $name")}

    var numLambda: ArrayList<Int> = divisionLamb(arrayListOf(30,15,40,80,20,)){num:Int->num/10}

        println(numLambda)

    //We apply the lambda function/value for each one of the items on the collection
   var nams:ArrayList<String> = listCustomers(arrayListOf("Manhique","Ernesto","Mario")){name:String->"This is the behavior of my lambda function $name"}//The lambda expression is going to be printed
   var nms:ArrayList<String> = listCustomers(arrayListOf("Manhique","Ernesto","Mario")){name->"Hello $name how are you?"}//The lambda expression is going to be printed

    for (i in nams){
        println(i)
    }





}

//Higher Order Function is a function that takes another function as a parameter!
fun Hello(names: ArrayList<String>,lambda:(String)->Unit){
    println("Printing Lambda Example")
    for(s in names){
        (lambda(s)) //This is like we are doing an operation with the parameters.
    }
}
fun divisionLamb(nums:ArrayList<Int>,divide:(Int)->Int):ArrayList<Int>{
    for(num in 0 until nums.size){
        if(nums[num]%2==0){
            nums[num]=divide(nums[num])
        }
    }
    return nums
}

fun listCustomers(names:ArrayList<String>,lam:(String)->String):ArrayList<String>{
    var messages= arrayListOf<String>()

    for(n in names){
        messages.add(lam(n))

        }
    return messages
}

