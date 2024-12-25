package exercise

fun main() {
    print("Masukkan sebuah Bilangan : ")
    val number = readLine()?.toIntOrNull() ?: 0

    if(number % 2 == 0){
        println("Bilangan $number adalah GENAP")
    } else {
        println("Bilangan $number adalah GANJIL")
    }
}