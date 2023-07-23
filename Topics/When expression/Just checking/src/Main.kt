fun main() {
    val n = when (readln()) {
        "1", "Java", "1.Java" -> "No!"
        "2", "Kotlin", "2.Kotlin" -> "Yes!"
        "3", "Scala", "3.Scala" -> "No!"
        "4", "Python", "4.Python" -> "No!"
        else -> "Unknown number"
    }
    println(n)
}