package com.project.kolintutor

class TestClass {
    fun testing() {
        var person = Person2()
        //a,b is not visible
        //c,d are visible
    }
}
open class Person2 {
    private val a = 1 // only available for same class
    protected val b = 2 // only available for subclass
    internal val c = 3 // only available within module
    public val d = 10
}

class Indian: Person2() {
    //a is not visible
    //b,c,d are visible
}