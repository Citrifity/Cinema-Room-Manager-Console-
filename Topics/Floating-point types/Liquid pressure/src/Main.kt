fun main() {
    val gravity = 9.8
    val densityFluid = readln().toDouble()
    val heightOfLiquidColumn = readln().toDouble()
    val liquidPressure = densityFluid * heightOfLiquidColumn * gravity
    println(liquidPressure)
}