package com.project.kolintutor

fun main(){
    var student = Student()
    println("Pass status: " + student.hasPassed(57))
    println("Scholarship status: " + student.isScholar(57))

    val str1:String = "Hello"
    val str2:String = "World"
    val str3:String = "Hey"

    println(str3.add(str1,str2))

    val x:Int = 6
    val y:Int = 10

    println(x.greaterValue(y))

    println(x greaterValue1 y)
}

//Infix function is similar with extension function
//but only one parameter and call type
infix fun Int.greaterValue1(Other: Int): Int {
    return if(this > Other) this
    else Other
}

fun Int.greaterValue(Other: Int): Int {
    if(this > Other) return this
    else return Other
}

fun String.add(s1:String, s2:String): String{
    return this + s1 + s2
}

fun Student.isScholar(marks:Int):Boolean{
    return marks > 90
}

class Student {
    fun hasPassed(marks:Int): Boolean{
        return marks > 40
    }
}