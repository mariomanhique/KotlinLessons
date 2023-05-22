package com.example.lkotlin
import com.example.lkotlin.Result
import java.io.IOException

//
//enum class Result{
//    SUCCESS,
//    FAILURE,
//    ERROR,
//    Idle,
//    LOADING
//}



fun main(){

    Repository.startFetch()
    getResult(Repository.getCurrentState())

    Repository.loadCompleted()
    getResult(Repository.getCurrentState())

    Repository.error()
    getResult(Repository.getCurrentState())


}

fun getResult(result:Result){
    return when(result){ //Return kword will return the text
       is NotLoading ->{
           println("Not Loading")
       }
        is Loading ->{
            println("Loading...")
        }
        is Success ->{
            println(result.dataFetched?:"Ensure you start the Fetch") //accessing dataFetched
        // from success class using result abstract class
        }
        is Error ->{
            println(result.exception.toString())
        }
        is Failure.CustomFailure ->{

        }
        is Failure.AnotherCustomFailure ->{

        }

    }
}

object Repository{
    private var loadState: Result=NotLoading
    private var fetchedData:String? =null


    fun startFetch(){
        loadState=Loading
        fetchedData="Data Fetched"
    }

    fun loadCompleted(){
        loadState=Success(fetchedData)
        fetchedData=null
    }

    fun error(){
        loadState=Error(Exception("An error occurred"))
    }

    fun getCurrentState(): Result{
       return loadState
    }

    fun customError(){
        loadState=Failure.CustomFailure(IOException(""))
    }
    fun anotherCustomError(){
        loadState=Failure.AnotherCustomFailure(NullPointerException(""))

    }

}

//abstract class Result
sealed class Result

data class Success(val dataFetched:String?): Result()
data class Error(val exception:Exception): Result()
object Loading: Result()
object NotLoading: Result()

sealed class Failure: Result(){
    data class CustomFailure(val customFailure:IOException):Failure()
    data class AnotherCustomFailure(val anotherCustomFailure:NullPointerException):Failure()
}

