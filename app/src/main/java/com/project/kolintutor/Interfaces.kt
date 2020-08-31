package com.project.kolintutor

fun main(){
    var test = MyButton()
    test.onClick()
    test.onTouch()
}

interface MyInterfaceListener {     // you can't create instance of interface class
    abstract var name: String //Properties in interface are abstract by default

    abstract fun onTouch()//Methods in interface are abstract by default

    public open fun onClick() {  //Normal Methods are public and open by default NOT FINAL
        println("onClick Interface code: Button Clicked")
    }
}

class MyButton : MyInterfaceListener {
    override var name: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun onTouch() {
        println("Button was touched")
    }

    override fun onClick() { //Optional to override
        super.onClick()
        println("Button was clicked")
    }
}

interface MyFirstInterface {     // you can't create instance of interface class

    fun onTouch() //Methods in interface are abstract by default

    fun onClick() {  //Normal Methods are public and open by default NOT FINAL
        println("MyFirstInterface: onClick")
    }
}

interface MySecondInterface {     // you can't create instance of interface class

    fun onTouch() {// Normal Methods
        println("MySecondInterface: onTouch")
    }

    fun onClick() {  //Normal Methods are public and open by default NOT FINAL
        println("MySecondInterface: onClick")
    }
}

class MyButton2 : MyFirstInterface, MySecondInterface{
    override fun onTouch() {
        super<MyFirstInterface>.onClick()
        super<MySecondInterface>.onClick()
    }

    override fun onClick() {
        super.onTouch()
    }

}