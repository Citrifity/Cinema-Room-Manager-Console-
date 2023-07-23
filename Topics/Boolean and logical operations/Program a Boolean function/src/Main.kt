fun main() {
    val x = readln().toBoolean() // read other values in the same way
    val y = readln().toBoolean()
    val z = readln().toBoolean()
    print(!(x && y) || (z))
}