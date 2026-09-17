fun main(){
    print("Введите число 1: ")
    var firstNum: Double = readln().toDouble()

    print("Введите число 2      : ")
    val secondNum: Double = readln().toDouble()

    print("Введите операцию: ")
    val operation: Char = readln().single()

    when (operation) {
        '+' -> firstNum += secondNum
        '-' -> firstNum -= secondNum
        '*' -> firstNum *= secondNum
        '/' -> firstNum -= secondNum
        else -> println("Операция не существует!")
    }

    println("$firstNum")
}
