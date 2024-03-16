package decision_making_and_loop

fun main(args: Array<String>) {
    val c = '*'

    if (c in 'a'..'z' || c in 'A'..'Z') {
        println("alphabet")
    } else {
        println("not alphabet")
    }
}