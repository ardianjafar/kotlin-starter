// Ketika sebuah fungsi yang menggunakannya tidak mengetahui jumlah argumen yang akan disematkan
/*
    - aturan pada vararg adalah parameter penggunaan di gunakan di akhir, dan tidak boleh terdapat 2 vararg dalam satu function
 */

fun sumNumbers(vararg number : Int) : Int {
    return number.sum()
}

fun finalValue(name : String, vararg values: Int){
    var total = 0.0
    for (value in values){
        total += value
    }
    total /= values.size
    println("Final value $name = $total")
}

fun main() {
    val number = sumNumbers(100,200, 3000, 40)
    println(number)
    println(finalValue("test",10,10))
}

