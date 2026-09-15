fun main(){
    print("Введите количество строк: ")
    val rows: Int = readln().toInt()

    print("Введите количество столбцов: ")
    val columns: Int = readln().toInt()
    var matrix = Array(rows) { IntArray(columns) }
    var differentNumbers: MutableSet<Int> = mutableSetOf()
    var currNum: Int

    println("Введите ${rows*columns} чисел: ")
    for (i in 0 .. rows-1){
        for (j in 0 .. columns-1){ //зачем здесь вообще двумерный массив создавать??
            print("Строка $i+1, столбец $j+1: ")
            currNum = readln().toInt()
            matrix[i][j] = currNum
            differentNumbers.add(currNum)
        }
    }

    val ans = differentNumbers.size
    println("В массиве использовано $ans различных чисел\n\nНажмите Enter для завершения")
    readln()
}

