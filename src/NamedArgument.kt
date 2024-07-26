// example bad
fun getFullName(first : String, middle : String, last: String) : String {
    return "$first $middle $last"
}
// contoh yang baik di terapkan
fun main(){
    val fullName = getFullName("John", "Peter", "Parker")
    println(fullName)
}