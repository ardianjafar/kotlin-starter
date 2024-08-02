import data.Boss

fun main(){
    val manyan = Boss("Manyan")

    val employee = manyan.Employee("Budi")
    val employee2 = manyan.Employee("Joko")

    employee.hi()
    employee2.hi()
}