package com.project.kolintutor

fun main(){
    Myclass.count

    Myclass.typeOfCustomer()
}

class Myclass {

    companion object{
        var count:Int = -1

        fun typeOfCustomer(): String {
            return "Indian"
        }
    }
}