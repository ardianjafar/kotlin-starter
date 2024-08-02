package oop

import kotlin.properties.Delegates

class Account(description : String = "") {
    val name : String by lazy {
        println("Name is called")
        "Manyan"
    }
    
    val description : String = Delegates.observable(description){ property, oldValue, newValue ->
        println("${property.name} is changed from $oldValue to $newValue")
    }.toString()

    
}