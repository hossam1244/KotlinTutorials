package arrays

import java.util.*
import kotlin.collections.HashSet


fun main(args: Array<String>) {

    val array = arrayOf("a", "b", "c", "c")
    val set = HashSet(listOf(*array))

    println("Set: $set")

}