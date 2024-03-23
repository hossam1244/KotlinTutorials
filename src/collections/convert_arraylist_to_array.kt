package collections

fun main(args: Array<String>) {
    val arrayList: List<Int> = mutableListOf(1,2,3,4,5)

    val array: Array<Int> = arrayList.toTypedArray()

    // printing elements of the array
    array.forEach { print(it) }
}