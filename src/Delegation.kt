import oop.Base
import oop.MyBase
import oop.MyBaseDelegate

class Delegate(val base : Base) : Base by base
fun main(){
    val base = MyBase()
    base.sayHello("Manyan")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Murun")

}