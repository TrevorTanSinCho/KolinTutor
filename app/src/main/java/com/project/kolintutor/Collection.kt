package com.project.kolintutor

fun array(){
    var myArray = Array<Int>(5) { 0 }
    myArray[0] = 32
    myArray[3] = 54
    myArray[1] = 11

    for (element in myArray)
        println(element)

    println()

    for (index in 0..myArray.size - 1)
        println(myArray[index])
}

fun listImmutable(){
    var list = listOf<String>("Yogi","Manmohan", "Valpayee") // Immutable, Fixed Size, Read only

    for (element in list)
        println(element)

    println()

    for (index in 0..list.size - 1)
        println(list[index])
}

fun listMutable(){
    var list = mutableListOf<String>("Yogi","Manmohan", "Valpayee") // Mutable, No Fixed Size, Can Add or Remove Elements
    var list1 = ArrayList<String>() // Mutable, No Fixed Size, Can Add or Remove Elements
    var list2 = arrayListOf<String>("Yogi","Manmohan", "Valpayee") // Mutable, No Fixed Size, Can Add or Remove Elements
    list.add("Tan")
    list.add("Chong")
    list.add("Lim")
    list.remove("Manmohan")
    list.add(1,"Modi")
    for (element in list)
        println(element)

    println()

    for (index in 0..list.size - 1)
        println(list[index])
}

fun ImmutableMap() {
    var myMap = mapOf<Int, String>(2 to "Yogi",43 to "Manmohan",7 to  "Valpayee") // Immutable, Fixed Size, Read only

    for (key in myMap.keys)
        println("Element at Key: $key = ${myMap[key]}")
}

fun MutableMap() {
    var myMap = HashMap<Int, String>() //  Mutable, No Fixed Size, Can Add or Remove Elements
    var myMap1 = hashMapOf<Int, String>() //  Mutable, No Fixed Size, Can Add or Remove Elements
    var myMap2 = mutableMapOf<Int, String>() //  Mutable, No Fixed Size, Can Add or Remove Elements
    myMap.put(4,"Yogi")
    myMap.put(43,"Manmohan")
    myMap.put(7,"Valpayee")

    myMap.put(43,"Modi")

    for (key in myMap.keys)
        println("Element at Key: $key = ${myMap[key]}")
}

fun ImmutableSet(){
    //"set" contains unique elements
    //"HashSet" also contains unique elements but sequence is not guaranteed in output

    var mySet = setOf<Int>(2,54,3,1,0,9,9,9,8) //Immutable, Read only

    for (element in mySet)
        println(element)
}

fun main(){
    //"set" contains unique elements
    //"HashSet" also contains unique elements but sequence is not guaranteed in output

    var mySet = mutableSetOf<Int>(2,54,3,1,0,9,9,9,8) //Immutable, Read only
    var mySet1 = hashSetOf<Int>(2,54,3,1,0,9,9,9,8) //Immutable, Read only
    mySet1.remove(54)
    mySet1.add(100)

    for (element in mySet1)
        println(element)
}