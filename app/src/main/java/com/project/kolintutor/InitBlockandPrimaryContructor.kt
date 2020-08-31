package com.project.kolintutor

fun main(){
    var student = StudentName("Sriyank",10)

    println(student.id)
}

class StudentName(var name:String){

    var id: Int = -1
    //primary constructors
    init {
        println("Student has got a name as $name ")
    }

    //secondary constructors, which can't define propertyp inside arameter
    constructor(n: String, id: Int) : this(n){
        // The body of the Secondary constructor is called after the init block
        this.id = id
    }
}