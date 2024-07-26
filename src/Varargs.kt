// Ketika sebuah fungsi yang menggunakannya tidak mengetahui jumlah argumen yang akan disematkan
/*
    - aturan pada vararg adalah parameter penggunaan di gunakan di akhir, dan tidak boleh terdapat 2 vararg dalam satu function
 */

fun sumNumbers(vararg number : Int) : Int {
    return number.sum()
}

fun main() {
    val number = sumNumbers(100,200, 3000, 40)
    println(number)
}

