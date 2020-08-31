package com.project.kolintutor

fun main(){
    var dog1 = Dog1("Black", "Pug")
    var dog2 = Dog2("Black", "Pug")
}

open class Animal1(var color: String){
    init {
        println("From Dog Init: $color")
    }
}

class Dog1(color: String, var breed: String): Animal1(color){
    init {
        println("From Dog Init: $color and $breed")
    }
}

open class Animal2 {
    var color: String = ""
    constructor(color: String){
        this.color = color

        println("From Animal: $color")
    }
}

class Dog2: Animal2 {
    var breed: String = ""
    constructor(color: String, breed: String): super(color){
        this.breed = breed

        println("From Dog: $color and $breed")
    }
}