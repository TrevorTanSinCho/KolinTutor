@file:JvmName("MyCustomKotlinFileName")
package com.project.kolintutor.KotlinJavaInteroperability


fun main(arg: Array<String>){
    var area = MyJavaFile.getArea(3,4)
    println("Printing area from Kotlin file: " + area)
}

@JvmOverloads
fun add(a:Int, b:Int, c:Int = 10): Int{
    return a+b+c
}