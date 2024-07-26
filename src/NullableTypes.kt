fun main(){
    // val text : String = null -> compile time error
    val text2 : String? = null // compile tidak error karena penambahan tanda ?

    var string : String? = "Dicoding"
    if(string != null) { // smart cast
        println(string.length) // it works now
    }

    var obj : Any = "Dicoding"
    if(obj is String){
        //Tidak membutuhkan casting secara eksplisit.
        print("String length is ${obj.length}")
    }

}
