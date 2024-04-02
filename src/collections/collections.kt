package collections

fun main() {
   list()
}


fun list() {
    val numbers = listOf(1,2,3,4)
    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers[2]}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\" ${numbers.indexOf(1)}")
}


fun map() {
}