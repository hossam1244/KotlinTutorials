package classes_and_objects

fun main() {
    /**
     * Kotlin does not have a new keyword when creating objects
     *
     *
     */
    val primary: Primary = Primary("")
    SecondaryConst("hos", 28)
    CompanionClass.propertyName
    CompanionClass.funName()
}

class Person {
    init {
        println("First initializer block in the class")
    }
}


class Empty

class Primary constructor(val name: String)

class SecondaryConst(val name: String) {

    constructor(name: String, age: Int) : this(name) {
        print(age)
    }
}

class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}


/**
 * A class may be declared abstract, along with some or all of its members.
 * An abstract member does not have an implementation in its class.
 * You don't need to annotate abstract classes or functions with open.
 */
abstract class Polygon {
    abstract fun draw()
}

class Rectangle : Polygon() {
    override fun draw() {
        // draw the rectangle
    }
}


/**
 * Companion object
 */
class CompanionClass {
    companion object {
        const val propertyName: String = "Something..."
        fun funName() {
            //...
            println("fun name")
        }
    }
}