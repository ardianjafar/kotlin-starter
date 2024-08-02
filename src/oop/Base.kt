package oop

interface Base {
    fun sayHello(name : String)
}
class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name!")
    }
}

class MyBaseDelegate(val base : Base) : Base by base