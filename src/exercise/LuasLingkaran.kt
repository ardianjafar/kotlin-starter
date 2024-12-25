package exercise

import kotlin.math.PI

fun main() {
    print("Masukkan Jari-Jari Lingkara : ")
    val radius = readLine()?.toDoubleOrNull() ?: 0.0
    val luas = PI * radius * radius
    println("Luas lingkaran dengan jari-jari $radius adalah $luas")
}