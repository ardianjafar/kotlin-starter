fun main(){
    val maxInt = Int.MIN_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)

    //  Perlu diketahui, hasil operasi pembagian pada tipe data Int akan dibulatkan kebawah.

    val numberOne : Int = 27
    val numberTwo: Int = 10

    print(numberOne / numberTwo)

    /*
    Dengan Kotlin kita juga bisa menuliskan nilai numerik yang “readable” dengan menggunakan tanda underscores
     */
    val readableNumbers = 1_000_000_000
    println(readableNumbers)
}
