fun main(){
//    val ranges = 1..5 -> bisa seperti ini atau di bawah nya
//    val ranges =  1.rangeTo(100) -> atau seperti di bawah nya
    val ranges = 1.rangeTo(100) step 3
    for(i in ranges){
        println("values is $i")
    }

//     untuk mengakses index setiap elemen yang ada pada ranges dengan memanfaatkan fungsi withIndex()
    for((index, value) in ranges.withIndex()){
        println("value $value with index is $index")
    }

//    kita juga bisa memanfaatkan forEach function
    ranges.forEach { value ->
        println("value is $value")
    }
}