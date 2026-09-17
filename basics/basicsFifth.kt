import kotlin.math.log
fun main() {
    print("Введите n: ")
    val n: Double = readln().toDouble()

    print("Введите x: ")
    val x: Double = readln().toDouble()

    val logarithm: Double = log(n, x)
    if(logarithm % 1 == 0.0){
        println(logarithm.toInt())
    }
    else{
        println("Целочисленный показатель не существует")
    }
}
