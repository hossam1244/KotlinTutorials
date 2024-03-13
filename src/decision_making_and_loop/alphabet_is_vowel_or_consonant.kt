fun main(args: Array<String>) {
    val ch = 'i'

    // using if condition
    var vowelConsonant: String =
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') "vowel" else "consonant"



    vowelConsonant = when (ch) {
        'a', 'e', 'i', 'o', 'u' -> "vowel"
        else -> "consonant"
    }
    println("$ch is $vowelConsonant")
}