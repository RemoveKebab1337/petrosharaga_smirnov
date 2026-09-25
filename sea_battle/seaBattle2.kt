fun main() {

    val playerField = createField(10)
    val enemyField = createField(10)
    val formattedPlayerField = formatField(playerField, "ИГРОК")
    val formattedEnemyField = formatField(enemyField, "ПРОТИВНИК")
    val fields = arrayOf(formattedPlayerField, formattedEnemyField)
    println(mergeFields(fields))

}


fun createField(size: Int = 10): Array<CharArray> {
    return Array(size) { CharArray(size) { '.' } }
}


fun formatField(field: Array<CharArray>, label: String, showShips: Boolean = true, debug: Boolean = false): String {


    val spacesAmount: Int = if (debug) (field[0].size*4+4-label.length-1)/2 else (field[0].size*2+3-label.length)/2
    var formattedField: String = "${" ".repeat(spacesAmount)}$label${" ".repeat(spacesAmount)}\n\n   "
    val alphabet: String = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"


    for (i in 0..field.lastIndex) {
        if (debug) formattedField += "  ${alphabet[i]} "
        else formattedField += "${alphabet[i]} "
    }
    formattedField += "\n"
    if (debug) formattedField+="   ${"+---".repeat(field.size)}+\n"

    for (i in 0..field.lastIndex) {

        if (i<9) formattedField += "${i+1}  "
        else formattedField += "${i+1} "
        if (debug) formattedField += "| "

        for ( j in 0..field.lastIndex) {
            if (showShips) formattedField += "${field[i][j]} "
            else {
                if (field[i][j] == '#') formattedField += ". "
                else formattedField += "${field[i][j]} "
            }
            if (debug) formattedField += "| "
        }
        formattedField += "\n"
        if (debug) formattedField+="   ${"+---".repeat(field.size)}+\n"

    }

    return formattedField
}

fun mergeFields(fields: Array<String>, indent: Int = 5): String {

    var mergedFields: String = ""
    var splittedFields = mutableListOf<List<String>>()
    var size: Int = 0
    val debugMode = fields[0].split("\n")[3].contains("+---")
    val coef: Int = if (debugMode) 1 else 2

    for ( i in 0..fields.lastIndex) {
        val tmp: List<String> = fields[i].split("\n")
        splittedFields.add(tmp)

        if (i == 0)
            size = (tmp[0].length-3)/coef
        else if ((tmp[0].length-3)/coef!=size){
            throw IllegalArgumentException("Поля должны быть одного размера!")
        }
    }
    val tmp: Int = if (debugMode) (size+7)/2 else size+2 // я эти цифры подбором искал :)
    for ( i in 0..tmp) {
        for ( j in 0..splittedFields.lastIndex) {
            mergedFields += "${splittedFields[j][i]}${" ".repeat(indent)}"
        }
        mergedFields += "\n"
    }

    return mergedFields
}
