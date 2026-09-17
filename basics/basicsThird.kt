fun main(){
    print("Введите число: ")
    var number: Int = readln().toInt()
    var ans: MutableList<Int> = mutableListOf()

    while (number > 0){
        ans.add(number%2)
        number /= 2
    }

    ans.reverse()
    println(ans.joinToString( separator = "" ))
}
