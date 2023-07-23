fun main() {
    val lawAge = 18..59
    val juliaAge = readln().toInt()
    println(juliaAge in lawAge)
}