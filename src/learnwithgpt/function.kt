package learnwithgpt

fun add(a : Int, b: Int) : Int {
    return a + b
}

fun multiply(c: Int, d: Int) = c + d // Fungsi yang di singkat

fun main(){
    val result = add(3,5)
    println("Result : $result")

    val resultShort = multiply(4,5)
    println("Result : $resultShort")
}