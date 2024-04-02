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


fun map() {
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    println("All keys: ${numbersMap.keys}")
    println("All values: ${numbersMap.values}")
    if ("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}")
    if (1 in numbersMap.values) println("The value 1 is in the map")
    if (numbersMap.containsValue(1)) println("The value 1 is in the map") // same as previous
    if (numbersMap.containsKey("key2")) println("The key2 is in the map") // same as previous

    val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)

    println("The maps are equal regardless of the pair order: ${numbersMap == anotherMap}")
}