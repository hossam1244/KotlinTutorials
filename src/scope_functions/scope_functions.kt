package scope_functions

fun main(args: Array<String>) {
    /**
     *  Scope functions don't introduce any new technical capabilities,
     *  but they can make your code more concise and readable.
     */

}


fun letExample() {
    val str: String? = "Hello"
    str?.let {
        println("The string's length is ${it.length}")
    }

    val numbersList = mutableListOf("one", "two", "three", "four", "five")
    numbersList.map { it.length }.filter { it > 3 }.let {
        println(it)
        // and more function calls if needed
    }

    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first().let { firstItem ->
        println("The first item of the list is '$firstItem'")
        if (firstItem.length >= 5) firstItem else "!" + firstItem + "!"
    }.uppercase()
    println("First item after modifications: '$modifiedFirstItem'")
}