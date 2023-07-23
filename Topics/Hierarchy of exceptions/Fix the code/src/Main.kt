fun main() {
    val index = readLine()!!.toInt()
    val word = readLine()!!
    if (word.length - 1 >= index) {
        println(word[index])
    } else {
        throw Exception("There isn't such an element in the given string, please fix the index!")
    }
}