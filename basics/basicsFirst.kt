fun main(){
    print("Введите строку: ")
    val input: String = readln() + ' '
    var currentChar: Char = input[0]
    var newString: String = currentChar.toString()
    var counter: Int = 1

    for (i in 1 .. input.length-1){
        if (input[i]!=currentChar){
            if (counter>1){
                newString+=counter.toString()
            }
            newString+=input[i]
            counter=0
        }
        counter += 1
        currentChar = input[i]
    }
    println(newString)
}
