fun main() {
    println("Enter a number:")
    val userInput = readLine()
    val maxNumber = userInput?.toInt()

    var a = 0
    var b = 1
    println(a)
    println(b)

    while (b < maxNumber) {
        val sum = a + b
        println(sum)

        a = b
        b = sum
    }
}
