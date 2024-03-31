package collections

fun main(args: Array<String>) {
    val arrayList: List<Int> = mutableListOf(1,2,3,4,5)

    val array: Array<Int> = arrayList.toTypedArray()
    array.forEach { print(it) }
}