import data.Student
import data.sayHello
import data.upperName

fun String.hello() : String {
    return "Hello $this"
}

fun main(){
    val name : String = "Manyan"
    val hello : String = name.hello()

    val student : Student? = Student("Eko", 15)
    student?.sayHello("Budi")
    println(student?.upperName)
}