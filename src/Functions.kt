fun setUser( name : String, age : Int) : String {
    return "Your name is $name and you $age years old"
}
fun setUser2( names : String, ages : Int) : String = "Your name is $names and you $ages years old"

fun main(){
    val user = setUser("Manyan", 22)
    println(user.toString())
}