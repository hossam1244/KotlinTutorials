package decision_making_and_loop

fun main(args: Array<String>) {
    val doubleOfArray = doubleArrayOf(2.3, 2.5, 2.9, 2.1)
    var largest = doubleOfArray[0]

    for (num in doubleOfArray) {
        if (largest < num)
              largest = num
    }
}