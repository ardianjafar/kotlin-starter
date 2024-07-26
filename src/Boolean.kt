fun main(){
    val officeOpen = 7
    val officeClosed = 16
    val now = 15

    val isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else {
        false
    }

    println("Office is open : $isOpen")
}