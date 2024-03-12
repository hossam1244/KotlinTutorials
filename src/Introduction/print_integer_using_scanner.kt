package Introduction

import java.util.Scanner

fun main(args: Array<String>) {
    // Creates a reader instance takes input from keyboard
    val reader = Scanner(System.`in`)
    print("Enter a number: ")
    val integer: Int = reader.nextInt()
    println("You've Entered: $integer")
}