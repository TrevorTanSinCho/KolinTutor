package com.project.kolintutor

fun main(){
    val myNumbers: List<Int> = listOf(2,3,4,6,23,90)

    val mySmallNums = myNumbers.filter { v -> v < 10 } // { it < 10 }

    for (num in mySmallNums)
        println(num)

    val mySquaredNums = myNumbers.map{ it * it }//{ s -> s * s}
    for (num in mySquaredNums)
        println(num)

    val mySmallSquredNums = myNumbers.filter { it < 10 }.map { it * it }
    for (num in mySmallSquredNums)
        println(num)

    var people = listOf<Person32>(Person32(10,"Sriyank"), Person32(23,"Annie"), Person32(17,"Sam"))
    var names = people.filter { it.name.startsWith("S") }
                      .map { it.name } // {people -> people.name}
    for (name in names)
        println(name)

    val myPredicate = {num:Int -> num > 10}

    val check1 = myNumbers.all { it > 10 } //Are all elements greater than 10?
    val check12 = myNumbers.all (myPredicate)
    println(check1)

    val check2 = myNumbers.any ({ it > 10 }) //Does any of these elements satisfy the Predicate
    val check22 = myNumbers.any (myPredicate)
    println(check2)

    val totalCount = myNumbers.count{ it > 10 } //Number of elements that satisfy the Predicate
    val totalCount1 = myNumbers.count(myPredicate)
    println(totalCount)

    val num = myNumbers.find{it > 10} //Returns the first number that matches the Predicate
    val num1 = myNumbers.find(myPredicate)
    println(num)
}

class Person32(var age:Int, var name:String){}