fun main() {
    val (hrs, mns, secs) = readln().split(' ')
    val (day, month, year) = readln().split(' ')
    print("$hrs:$mns:$secs $day/$month/$year")
}