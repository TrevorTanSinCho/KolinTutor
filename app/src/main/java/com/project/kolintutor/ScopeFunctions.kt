package com.project.kolintutor

/**
 * with: If you want to operate on a non-null object
 * let: If you want to just execute lambda expression on a nullable
 *      object and avoid NullPointerException
 * run: If you want to operate on a nullable object, execute lambda
 *      expression and avoid NullPointerException, it's combine 'with' & 'let'
 * apply: If you want to initialise or configure an object
 * also: if you want to do some additional object configuration or operations
 */
class PersonScope {
    var name: String = "Sriyank Siddhartha"
    var age: Int = 26
}

fun applywith(){
    /**
     * Scope Function: 'with' & 'apply'
     * Property 1: Refer to context object by using 'this'
     * Property 2: The return value is the 'lambda result'
     */

    val person = PersonScope()

    val ageAfterFiveYears:String = with(person){
        println(this.name)
        println(this.age)
        println(name)
        println(age)
        age + 5
        "this is a last sentance testing"
    }

    println("Age after five years is $ageAfterFiveYears")

    val person1 = PersonScope().apply {
        this.name = "TestingName"
        this.age = 26
    }

    with(person1){
        println(this.name)
        println(this.age)
    }

    val duplicatePerson = person1.also {
        it.name = "Shreks from Smartherd"
        println("New name: ${it.name}")
    }
}

fun also(){
    /**
     * Scope Function: 'also'       'ALSO PERFORM THE FOLLOWING EXTRA OPERATION'
     * Property 1: Refer to context object by using 'it'
     * Property 2: The return value is the 'context object'
     */

    val numbersList: MutableList<Int> = mutableListOf(1,2,3)

    val duplicationNumber = numbersList.also {
        println("The list elements are: $it")
        it.add(4)
        println("The list elements after adding an element: $it")
        numbersList.remove(2)
        println("The list elements after adding an element: $it")
    }
//    println("The list elements are: $numbersList")
//
//    numbersList.add(4)
//    println("The list elements after adding an element: $numbersList")
//
//    numbersList.remove(2)
//    println("The list elements after adding an element: $numbersList")

    println("Original: $numbersList")
    println("Duplicate: $duplicationNumber")
}

fun let(){
    /**
     * Scope Function: 'let'
     * Property 1: Refer to context object by using 'it'
     * Property 2: The return value is the 'lambda result'
     * Use 'let' function to avoid NullPointerException
     */
    val name: String? = "null"

    val stringLength = name?.let {
        println(it.reversed())
        println(it.capitalize())
        it.length
    }

//    println(name!!.reversed())
//    println(name!!.capitalize())
//    println(name!!.length)

    println(stringLength)
}

fun main(){
    /**
     * Scope Function: 'with' & 'apply'
     * Property 1: Refer to context object by using 'this'
     * Property 2: The return value is the 'lambda result'
     * 'run' is combination of 'with' and 'let'
     * If you want to operate on a Nullable object and avoid NullPointerException then use 'run'
     */

    val person:PersonScope? = null

    val bio = person?.run {
        println(this.name)
        println(this.age)
        println(name)
        println(age)
        age + 5
        "this is a last sentance testing"
    }

    println(bio)
}