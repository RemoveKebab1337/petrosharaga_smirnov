fun main(){
    print("Введите размерность квадратной матрицы: ")
    val rows: Int = readln().toInt()

    var matrix = Array(rows) { IntArray(rows) }

    println("Введите ${rows*rows} чисел: ")
    for (i in 0 .. rows-1){
        for (j in 0 .. rows-1){
            print("Строка ${i+1}, столбец ${j+1}: ")
            matrix[i][j] = readln().toInt()
        }
    }

    var flag: Boolean = true

    for (i in 1 .. rows-1){
        for(j in 0 .. i-1){
            if(matrix[i][j] != matrix[j][i]){
                flag = false
                break
            }
        }
    }

    if (flag){
        println("Массив является симметричным относительно главной диагонали")
    }
    else{
        println("Массив НЕ является симметричным относительно главной диагонали")
    }
}

