fun println(vararg value: Any) {
    value.forEach(::println)
}

fun main() {
    val n = readln().toInt()
    var l = 0
    var s = 0
    var p = 0
    repeat(n) {
        val cur = readln().toInt()
        if (cur == 1) {
            l += 1
        } else {
            if (cur == -1) {
                s += 1
            } else {
                p += 1
            }
        }
    }
    println(p, l, s)
}