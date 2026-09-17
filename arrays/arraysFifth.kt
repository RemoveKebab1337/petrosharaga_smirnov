fun main(){
    print("Введите количество слов: ")
    val amount: Int = readln().toInt()
    var words: MutableList<String> = mutableListOf()
    for (i in 0 .. amount-1){
        print("Введите ${i+1} слово: ")
        words.add(readln())
    }
    while(words.size>0){
        var tmp: MutableList<String> = mutableListOf(words[0])
        val charset: HashSet<Char> = words[0].toHashSet()
        words.removeAt(0)
        var i: Int = 0
        while(i<words.size){
            val charsetTemp: HashSet<Char> = words[i].toHashSet()
            if(charset == charsetTemp){
                tmp.add(words[i])
                words.removeAt(i)
            }
            i+=1
        }
        println(tmp.joinToString())
    }
}
