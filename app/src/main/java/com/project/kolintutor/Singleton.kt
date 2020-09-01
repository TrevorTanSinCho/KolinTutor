package com.project.kolintutor

fun main(){
    CustomersData.count = 98
    CustomersData.typeOfCustomers()

    println(CustomersData.count)

    CustomersData.myMethod("Hello")
}

open class MySuperClass {
    open fun myMethod(str: String){
        println("MySuperClass")
    }
}
object CustomersData : MySuperClass(){
    var count:Int = -1

    fun typeOfCustomers(): String{
        return "Indian"
    }

    override fun myMethod(str: String) {
        super.myMethod(str)
        println("object CustomerData: " + str)
    }
}