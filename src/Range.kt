fun main(){
//    val rangeInt = 1..10 step 2
//    print(rangeInt.step)
//    rangeInt.forEach{
//        print(it)
//    }
//    println(rangeInt.step)

    val tenToOne = 11.downTo(1)
//    if( 7 in tenToOne ) println("in 7")
    if (11 !in tenToOne){
        println("No value 11 in range")
    }else {
        println("Here you go")
    }
}