package com.example.lkotlin

class Student(val name:String)
class Numbers(val num:Int)


interface MyArray<M>{
    fun addItem(item:M)
    fun removeItem(item:M)

}



    class MyArrayImpl<T>() : MyArray<T> {
        var items = arrayListOf<T>()

        override fun addItem(item: T) {
            items.add(item)
        }

        override fun removeItem(item: T) {
            items.remove(item)
        }
    }


class Finder3<M>(private val list: List<M>){

    fun findItem(element: M) {
        val itemFoundList = list.filter {
            it==element// If it equals element
        }

        found(itemFoundList)
    }


    fun found(newList: List<M>){

        var foundItem:M?
        if(newList.isNullOrEmpty()){

            foundItem = null

        }else{
            foundItem = newList.first()

        }

        println(foundItem)

    }
}

    fun main(){

//        var mList=MyArrayImpl<Student>()
//        var nList=MyArrayImpl<Numbers>()
//
//        mList.addItem(Student(""))
//        mList.removeItem(Student(""))
//
//        nList.addItem(Numbers(1))
//        nList.removeItem(Numbers(2))
//
//        var mLis=MyArrayImpl<String>()
//        mLis.addItem("")
//        mLis.removeItem("")
        val person1 = Person("Mario","Manhique")
        val person2 = Person("Ernesto","Manhique")
        val person3 = Person("Nicolas","Manhique")
        val person4 = Person("Nick","Manhique")
        val listNames= listOf<String>("Mario","Domingas","Ernesto","Manhique")
        val listNumbers= listOf<Int>(1,2,3,4,5)
        val listPerson= listOf<Person>(person1,person2,person3,person4)
        val finderPerson= Finder2(listPerson)

        finderPerson.findItem(person2){
            println("Found him/her, the name is ${it?.name} and last name is ${it?.lastName}")
        }


        val finderNames = Finder2(listNames)
        finderNames.findItem("Mario"){
                println("Found $it")
            }
        val finder = Finder2(listNumbers)
        finder.findItem(3){
            println("Found $it")
        }

        val finderPersonNoLamb= Finder3(listPerson)

        println("Testing With no lambdas")
        finderPersonNoLamb.findItem(person4)

    }



        class Finder2<M>(private val list: List<M>) {

            fun findItem(element: M, foundItem: (element: M?) -> Unit) {
                val itemFoundList = list.filter {
                    it == element// If it equals element
                }
                if (itemFoundList.isNullOrEmpty()) foundItem(null) else
                    foundItem(itemFoundList.first())
            }
        }

        class Finder4<M>(private val list: List<M>) {

        }




        data class Person(val name:String,val lastName:String)








