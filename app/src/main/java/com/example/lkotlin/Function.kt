package com.example.lkotlin

fun main(){

    val pro= mapOf(Pair("Rice",3.0),Pair("Been",2.0))
    cost(pro)
}

fun askData(){

    var input= readLine()?:""

    for (i in 1..3){

        println("")
    }

}

fun lifSpan(name:String){

    if(name=="Cat"){
        println("This animal lifespan is 15")
    }else if(name=="Dog"){
        println("This animal lifespan is 20")

    }

}

fun calculate(radius:Int)=3.14 * radius * radius //Function Shorthand statement

//More functions(Overloading, )

//Same name method but different number or types of parameters
fun multiply(num:Int)=num * 2
fun multiply(num:Int,multiplier:Int)= num * multiplier

fun sayHello(people:String){

}
fun sayHello(people:Collection<String>){

}

fun cost(product:String,price:Double?){
    println("A $product costs ${price?.times(1.2)}")


}

fun cost(products:Map<String,Double>){
    for(product in products.keys){
        cost(product, products[product])

    }



}