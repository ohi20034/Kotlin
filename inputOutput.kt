import java.util.*

fun main() {
    // taking a number as a input
    print("Enter a number: ")
    var reader = Scanner(System.`in`)
    var num = reader.nextInt()
    println(num)

    reader.nextLine() // ignore buffer problem

    // taking input a string
    print("Enter a string: ")
    var string = reader.nextLine()
    println(string)
    println(string.length)
    // taking input a double number
    print("Enter a double value: ")
    var double = reader.nextDouble()
    println(double)

    // taking input a float number
    print("Enter a flaot value: ")
    var float = reader.nextFloat()
    println(float)
}
