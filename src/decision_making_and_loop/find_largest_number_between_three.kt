fun main(args: Array<String>) {
    val i = 1
    val b = 2
    val c = 3


    // using if-condition
    if (i >= b && i >= c) {
        println("$i")
    } else if (b >= i && b >= c) {
        println("$b")
    } else {
        println("$c")
    }

    // using switch
    when {
        i >= b && i >= c -> println("$i")
        b >= i && b >= c -> println("$b")
        else -> println("$c")


    }
}