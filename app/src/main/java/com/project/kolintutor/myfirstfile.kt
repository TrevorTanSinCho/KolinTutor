package com.project.kolintutor

fun personclass(args: Array<String>){
    var person = Person("Steve")
    println("The person name is ${person.name}")

}

class Person (var name: String = ""){
    fun display(){
        print(name)
    }
}

fun range(){
    val r1 = 1..5
    //This range contains the number 1,2,3,4,5

    val r2 = 5 downTo 1
    //5,4,3,2,1

    val r3 = 5 downTo 1 step 2
    //5,3,1

    var r4 = 'a'..'z'
    //"a","b","c"..."z"

    var isPresent = 'c' in r4

    var countDown = 10.downTo(1)
    //10,9,8 ... 1

    var moveUp = 1.rangeTo(10)
    //1,2,3,4,5..10

}

fun main(){//ifexpress(){
    val a = 2
    val b = 5

    var maxValue:Int = if (a > b)
        a
    else {
        println("b is greater")
        b
    }
    var value = max(a,b)
    println(value)
    println(maxValue)
}

fun max(a: Int, b: Int): Int = if(a>b) a else b

fun whenstate(){
    val x = 1

    var str:String = "null"

    when(x){
        0, 1 -> println("x is 0 or 1")
        2->println("x is 2")
        3 -> str = "x value is 3"
        in 1..20 -> println("x lies in 1 to 20")
        else -> {
            println("x value is unknown")
            println("I dont know what is x")
        }
    }

    var str2:String = when(x){
        0, 1 -> "x is 0 or 1"
        2->"x is 2"
        3 -> "x value is 3"
        in 1..20 ->  "x lies in 1 to 20"
        else -> {
            "x value is unknown"
        }
    }
    println(str)
    println(str2)
}

fun forloop(){
    for (i in 1..10){
        println(i)
        if(i == 5) break
    }
    for (i in 1..10){
        if(i == 5) continue
        println(i)
    }
    for (i in 1..3){
        for (j in 1..3){
            println("$i $j")
            if(i == 1 && j == 1)
                break
        }
    }
    println()
    myloop@ for (i in 1..3){
        for (j in 1..3){
            println("$i $j")
            if(i == 1 && j == 1)
                break@myloop
        }
    }
}

fun whileloop(){
    var i:Int = 1
    while(i <= 10){
        println(i)
        i++
    }
}

fun dowhileloop(){
    var i:Int = 1
    do {
        println(i)
        i++
    } while(i <= 10)
}
