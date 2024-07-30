package oop

// covariant mengizinkan substitusi dengan turunan sementara contravariant mengizinkan substitusi dengan superclass
fun main(){

}

fun factorial(n: Int, newResult: Int) : Int {
    return if ( n == 1){
        n
    } else {
        var result = 1
        for ( i in 1..n){
            result *=n
        }
        result
    }
}