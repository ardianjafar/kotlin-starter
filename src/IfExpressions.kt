fun main() {
    val openHours = 7
    val now = 20
    val office : String
    if(now > openHours) {
        office= "office already open"
    }else{
        office= "office already close"
    }

    println(office)

    // atau penggabungan else if

    val openHours2 = 8
    val now2 = 9
    val office2: String
    office2 = if ( now2 > 8) {
        "Office is already open"
    } else if ( now2 == openHours2){
        "Wait a minute, office will be open soon"
    } else {
        "Office is close"
    }

    println(office2)
}