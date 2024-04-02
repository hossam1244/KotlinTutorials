package collections

fun main() {
    list()
    listWithWriteOperation()
    set()
}


fun list() {
    val numbers = listOf(1, 2, 3, 4)
    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers[2]}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\" ${numbers.indexOf(1)}")
}


fun listWithWriteOperation() {
    val numbers = mutableListOf(1, 2)
    println("Remove first element: ${numbers.removeAt(0)}")
    println("Add to first element: ${numbers.add(0, 1)}")
}


fun set() {
    val numbers = setOf(1, 2, 3)
    val numbers2 = mutableSetOf(1, 2)
}