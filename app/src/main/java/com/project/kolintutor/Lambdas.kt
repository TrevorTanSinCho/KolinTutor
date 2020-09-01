package com.project.kolintutor

fun main(){
    val program = Program()

    program.addTwoNumbers(2,7)

    program.addTwoNumbers(2,7, object : MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }

    })
    val test: String = "Hello"
    val myLambda: (Int) -> Unit = {s: Int -> println(s)}
    val myLambda1: (Int,Int) -> Int = {x: Int, y:Int -> x + y}
    //test variable, type is (Int) -> Unit, input parameter is s which type is Int, body is println(s)
    //may reference to test
    //Unit is mean return void
    program.addTwoNumbers(2,7,myLambda)
    program.addTwoNumbers(2,7,{s -> println(s)})
    program.addTwoNumbers(2,7,myLambda1)
    program.addTwoNumbers(2,7,{x, y -> x + y})

    var result = 0
    program.addTwoNumbers1(2,7,{x,y -> result = x + y})
    println("result $result")

    program.reverseAndDisplay("Hello", {s -> s.reversed()})
    program.reverseAndDisplay("Hello", {it.reversed()}) //only apply in only one input parameter

    var person = PersonWith()
    with(person){
        name = "Sriyank"
        age = 23
    }
    println(person.name)
    println(person.age)
    person.apply {
        name = "Tan"
        age = 32
    }.startRun()
    println(person.name)
    println(person.age)
}

class PersonWith {
    var name: String = ""
    var age: Int = -1

    fun startRun() {
        println("Now ${this.name} am ready to run ${this.age}")
    }
}

class Program {
    fun reverseAndDisplay(str:String, myFunc:(String) -> String){
        println("Reverse " + myFunc(str))
    }

    fun addTwoNumbers1(a: Int, b: Int, action: (Int,Int) -> Unit){//High Level Function with Lambda as Parameter
        action(a,b)
    }

    fun addTwoNumbers(a: Int, b: Int, action: (Int,Int) -> Int){//High Level Function with Lambda as Parameter
        println("myLambda1 " + action(a,b))
    }

    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit){//High Level Function with Lambda as Parameter
        val sum = a + b
        action(sum)
    }

    fun addTwoNumbers(a: Int, b: Int, action: MyInterface){//using interface / object oriented way
        val sum = a + b
        action.execute(sum)
    }

    fun addTwoNumbers(a: Int, b: Int){//simple way
        val sum = a + b
        println(sum)
    }
}

interface MyInterface {
    fun execute(sum: Int)
}