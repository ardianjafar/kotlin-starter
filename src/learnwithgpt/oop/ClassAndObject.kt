package learnwithgpt.oop

class Person(val name : String, var age : Int)

fun main(){
    val person = Person("John", 25)
    println("${person.name} is ${person.age} years old")
}