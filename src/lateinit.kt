lateinit var name : String
fun main(){
    name =  ""
    if(::name.isInitialized)
        print(name.length)
    else
        print("Not Initialized")
}