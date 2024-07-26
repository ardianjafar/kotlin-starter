fun main(){
    // dengan di tambahkan tanda ? maka akan melewati tanda error
    val text : String? = null
    text?.length

    val text2 : String? = null
    val textLength = text?.length ?: 7

    // Kode di atas sebenarnya sama seperti ketika kita menggunakan if/else berikut.
    val textLength3 = if (text != null) text.length else 7

}