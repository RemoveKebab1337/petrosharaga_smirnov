fun main(){
    val alphabet: List<Char> = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя".toCharArray().asList() //делаю с обычным алфавитом

    print("Введите ключевое слово: ")
    val keyword: String = readln().lowercase()

    print("Введите шифруемое слово: ")
    val word: String = readln().lowercase()

    var ans: MutableSet<Char> = mutableSetOf()

    for (i in 0 .. word.length-1){
        if(word[i]==' '){
            ans.add(' ')
            continue
        }
        val tmp: Int = (alphabet.indexOf(word[i]) + alphabet.indexOf(keyword[i%keyword.length])) % 33
        ans.add(alphabet[tmp])
    }

    val result: String = ans.joinToString(separator="")
    println("Зашифорванное слово: $result")
}

