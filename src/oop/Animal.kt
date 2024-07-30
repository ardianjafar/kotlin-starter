package oop

abstract class Animal{
    // default value not allowed
    abstract val age: Int // must be overridden

    // default value allowed
    open val isEating = true // optional to be overridden
    val isRespire = true
}

interface Iwalk {
    // default not allowed
    val numberOfLeg : Int // must be overridden
    fun walk() // must be overridden
}

interface IDrink{

}

class Camel : Animal(), Iwalk, IDrink{
    override val age: Int = 7
    override val isEating = true
    override val numberOfLeg: Int = 2
    override fun walk() {
        println("Camel can't walk ")
    }
}

fun main(){
    val camel = Camel()
    camel.walk()
}