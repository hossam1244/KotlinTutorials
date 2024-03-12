package Introduction

fun main(args: Array<String>) {
    var value: String = "A b c d"
    println("Original value: $value")
    value = value.replace("\\s".toRegex(), "")
    println(value)

}