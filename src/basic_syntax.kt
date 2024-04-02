fun main() {

}

/**
 * Variables
 */
 fun variables() {
    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment
 }


/**
 * Functions
 */

fun sum(a: Int, b: Int): Int {
    return a + b
}

// A function body can be an expression. Its return type is inferred.
fun sumExpression(a: Int, b: Int) = a + b


// A function that returns no meaningful value.
fun printSumWithReturnType(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

// Unit return type can be omitted.
fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}


/**
 * Creating classes and instances
 */
class Shape

// Properties of a class can be listed in its declaration or body.
class Rectangle(val height: Double, val length: Double) {
    val perimeter = (height + length) * 2
}


open class ShapeOpen

class RectangleInherit(val height: Double, val length: Double): ShapeOpen() {
    val perimeter = (height + length) * 2
}


/**
 * For loops - While loops
 */

fun forLoops() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

//    val items = listOf("apple", "banana", "kiwifruit")
//    for (index in items.indices) {
//        println("item at $index is ${items[index]}")
//    }
}


fun whileLoop() {
    val items = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}