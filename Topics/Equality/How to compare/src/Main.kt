fun solution(numbers: List<Int>): Int {
    var listSum = 0
    for (i in numbers) {
        listSum += i
    }
    return listSum
}

fun main() {
    println(solution(numbers = readln().split(" ").toInt()))
}