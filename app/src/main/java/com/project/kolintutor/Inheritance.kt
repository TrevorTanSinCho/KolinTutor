package com.project.kolintutor

fun main(){
    var cat = Cat()
    var dog = Dog()

    cat.eat()
    dog.eat()
    println(dog.color)
}

open class Animal {
    open var color: String = ""

    open fun eat() {
        println("Eat")
    }
}

public final class Dog: Animal(){
    public final var breed: String = ""

    override var color: String = "Black"

    fun bark() {
        println("Bark")
    }

    override fun eat(){
        super<Animal>.eat()//if got two classes have same method
        println("Dog is eating")
    }
}

class Cat: Animal(){
    var age: Int = -1

    fun meow() {
        println("Meow")
    }

    override fun eat(){
        println("Cat is eating")
    }
}
