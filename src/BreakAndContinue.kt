fun main(){
    val listOfInt = listOf(1,2,3, null , 5, null, 7)
    for(i in listOfInt) {
        print(i)
    }

//    for(i in listOfInt) {
//        if(i==null) continue
//        print(i)
//    }
//
//    for(i in listOfInt) {
//        if(i==break)continue
//        print(i)
//    }
    breakA()
}

fun breakA(){
   loop@ for (i in 1..10) {
       println("Outside loop")

       for (j in 1..10) {
           println("Inside loop")
           if(j > 5 ) break@loop
       }
   }
}