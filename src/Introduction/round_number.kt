package Introduction

import java.math.RoundingMode
import java.text.DecimalFormat


fun main(args: Array<String>) {
    val num = 1.34567
    // round number using formatting
    println("%.4f".format(num))

    // round number using decimal formatting
    val df = DecimalFormat("#.###")
    df.roundingMode = RoundingMode.CEILING
    println(df.format(num))
}