package com.project.kolintutor

abstract class Person4 {
    abstract var name: String
    abstract fun eat()          //abstract properties are "open" by default, must be overridden by subclass
    open fun getHeight() {}     //A "open" function ready to be overridden
    fun goToSchool() {}         //A normal Function: public and final by default
}

class Chinese: Person4(){
    override var name: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun eat() {
        TODO("Not yet implemented")
    }

}