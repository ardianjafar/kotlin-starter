typealias App = Application
typealias App2 = data2.Application

typealias StringSupplier = () -> String

fun sayHello(supplier : StringSupplier){
    println("Hello ${supplier()}")
}
fun main(){
    val app = App("Kotlin Itu Mudah")
    val app2 = App2("Kotlin Itu Mudah, Type Alias 2")

    sayHello{"Manyan Intelek dan ganteng"}
    }