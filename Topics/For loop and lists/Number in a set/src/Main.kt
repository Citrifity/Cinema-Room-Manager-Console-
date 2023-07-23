fun main() {
    val n = readln().toInt()
    val arr = mutableListOf<Int>()
    for (i in 0 until n) {
        arr.add(readln().toInt())
    }
    val m = readln().toInt()
    if (m in arr) {
        println("YES")
    } else {
        println("NO")
    }
}