package decision_making_and_loop

import java.math.BigInteger


fun main(args: Array<String>) {
    val num = 30
    var factorial = BigInteger.ONE
    for (i in 1..num) {
        factorial = factorial.multiply(BigInteger.valueOf(i.toLong()))
    }
    println("Factorial of $num = $factorial")
}