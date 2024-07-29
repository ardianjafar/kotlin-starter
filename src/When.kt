fun main(){
//    val value = 70
//    when(value){
//        6 -> println("in 6")
//        7 -> println("in 7")
//        8 -> println("in 8")
//        9 -> println("in 9")
//        else -> println("value can't be reached ")
//    }
    /*
    Jika kita memiliki dua atau lebih baris kode yang akan kita jalankan di setiap branch, kita bisa memindahkannya ke dalam curly braces seperti berikut:
     */
    val value = 7
    val stringOfValue = when(value) {
        6 -> "x is six"
        7 -> "x is seven"
        8 -> "x is eight"
        else ->
            println("undefined")
    }
        println(stringOfValue)

    }