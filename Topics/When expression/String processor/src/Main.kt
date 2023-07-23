fun main() {
    val s1 = readln()
    val deystvie = readln()
    val s2 = readln()
    println(
        when (deystvie) {
            "equals" -> s1 == s2
            "plus" -> s1 + s2
            "endsWith" -> s1.endsWith(s2)
            else -> "Unknown operation"
        }
    )
}