fun main(){

    print("Введите длину первого массива: ")
    val firstLen: Int = readln().toInt()
    var firstList: MutableList<Int> = mutableListOf()
    for (i in 0 .. firstLen-1){
        print("Введите ${i+1} элемент первого массива: ")
        firstList.add(readln().toInt())
    }
    println()
    var ans: MutableList<Int> = mutableListOf()

    print("Введите длину второго массива: ")
    val secondLen: Int = readln().toInt()
    for (i in 0 .. secondLen-1){
        print("Введите ${i+1} элемент второго массива: ")
        val tmp: Int = readln().toInt()
        if (tmp in firstList){ //опять же, создавать полноценный массив не имеет мысла по формулировке задания
            firstList.remove(tmp)
            ans.add(tmp)
        }
    }
    ans.sort()
    println("Повторяющися элементы: ${ans.joinToString()}")
}
