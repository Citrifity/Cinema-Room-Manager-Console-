fun main() {
    val inputNew = readln().toString()
    val nums = "1234567890"
    for (i in inputNew) {
        if (i in nums) {
            println(i)
            break
        }
    }
}