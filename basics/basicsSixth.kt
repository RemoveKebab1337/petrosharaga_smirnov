fun main(){
    print("Введите первую цифру: ")
    val firstDigit: Byte = readln().toByte()

    print("Введите вторую цифру: ")
    val secondDigit: Byte = readln().toByte()

    if (firstDigit%2==1 || secondDigit%2==1){
        if (firstDigit%2==1){
            println("$secondDigit$firstDigit")
        }
        else{
            println("$firstDigit$secondDigit")
        }
    }
    else{
        println("Создать нечётное число невозможно")
    }
}
