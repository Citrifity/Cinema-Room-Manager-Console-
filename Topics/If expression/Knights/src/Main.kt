import kotlin.math.*

fun main() {
    val (x1, y1) = readln().split(' ')
    val (x2, y2) = readln().split(' ')
    val x3 = x1.toInt() - x2.toInt()
    val y3 = y1.toInt() - y2.toInt()
    if ((abs(x3) == 2 && abs(y3) == 1) || (abs(x3) == 1 && abs(y3) == 2)) {
        println("YES")
    } else
        println("NO")
}