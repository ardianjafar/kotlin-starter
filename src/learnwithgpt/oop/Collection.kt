package learnwithgpt.oop

fun main(){
    val numbers = listOf(1,2,3) // list immutable / atau yang tidak bisa berubah
    val mutableNumbers = mutableListOf(1,2,3) // List mutable

    println(numbers[0])
    mutableNumbers.add(4)
    println(mutableNumbers) // Output : [1, 2, 3, 4]
}