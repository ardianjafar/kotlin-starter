fun String.hello() : String {
    return "Hello $this"
}

fun main(){
    val name : String = "Manyan"
    val hello : String = name.hello()
}