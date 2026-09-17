fun main(){
    print("Введите строку: ")
    val inputString: String = readln()
    val inputSet: Set<Char> = inputString.toSortedSet()

    for (i in inputSet){
        println("$i – ${inputString.count { it == i } }")
    }
}
