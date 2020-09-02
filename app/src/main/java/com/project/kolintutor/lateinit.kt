package com.project.kolintutor

/**
 * 1. Use it with mutable variables var
 * lateinit var name:String //Allowed
 * lateinit val name:String //Not allowed
 *
 * 2. Allowed with only non-nullable data types
 * lateinit var name:String //Allowed
 * lateinit var name:String? //Not allowed
 *
 * 3. It's a promise to compiler that the value will be initialized in future
 * Note: If you try to access lateinit variable without initializing it then it throws
 *       UninitializedPropertyAccessException
 */
fun lateinit(){
    val country = Country()
    country.setup()
}

class Country {
    lateinit var name: String

    fun setup() {
        name = "usa"
        println("The name of country is $name")
    }
}

val pi2: Float = 3.14f  //waste of memory
val pi: Float by lazy { 3.14f }
// The variable can be var or val
// The variable can be nullable or non-nullable
fun main(){
    val area1 = pi * 4 * 4
}