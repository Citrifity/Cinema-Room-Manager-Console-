package cinema

import java.util.Scanner

fun print(vararg value: Any) {
    value.forEach(::print)
}

fun println(vararg value: Any) {
    value.forEach(::println)
}

fun main() {
    val scanner = Scanner(System.`in`)
    var sumOfTickets = 0
    var amountOfTickets = 0
    var rowNumber1 = 0
    var seatsNumber1 = 0
    println("Enter the number of rows:")
    val rows = readln().toInt()
    println("Enter the number of seats in each row:")
    val seats = readln().toInt()
    println("")
    val rowList = MutableList(rows) { MutableList(seats) { 'S' } }
    for (j in 0..100) {
        println("1. Show the seats")
        println("2. Buy a ticket")
        println("3. Statistics")
        println("0. Exit")
        val wToDo = scanner.nextInt()
        if (wToDo == 1) {
            println("Cinema:")
            print("  ")
            for (i in 1..seats) {
                if (i != seats) {
                    print(i, " ")
                } else {
                    println(i)
                }
            }
            for (i in 1..rows) {
                print(i, " ")
                println(rowList[i - 1].joinToString(" "))
            }
        } else if (wToDo == 2) {
            println("Enter a row number:")
            val rowNumber = readln().toInt()
            println("Enter a seat number in that row:")
            val seatNumber = readln().toInt()
            try {
                rowList[rowNumber - 1][seatNumber - 1]
            } catch (e: IndexOutOfBoundsException) {
                println("Wrong input!")
                continue
            }
            val ticketPrice: Int = if (rows * seats <= 60) {
                10
            } else {
                val firstHalf = rows / 2
                if (rowNumber in 1..firstHalf) {
                    10
                } else {
                    8
                }
            }
            sumOfTickets += ticketPrice
            amountOfTickets += 1
            rowNumber1 = rowNumber
            seatsNumber1 = seatNumber
            if (rowList[rowNumber - 1][seatNumber - 1] == 'B') {
                println("That ticket has already been purchased!")
            } else {
                println("Ticket price: $$ticketPrice")
            }
            rowList[rowNumber - 1].removeAt(rowNumber - 1)
            rowList[rowNumber - 1].add(seatNumber - 1, 'B')
        } else if (wToDo == 3) {
            var percentage = 0.0
            percentage = if (amountOfTickets != 0) {
                amountOfTickets * (100.00 / (seats.toDouble() * rows.toDouble()))
            } else {
                0.0
            }
            val formatPercentage = "%.2f".format(percentage)
            val totalIncome: Int = if (rows * seats <= 60) {
                seats * rows * 10
            } else {
                var firstHalf = 0
                var secondHalf = 0
                if (rows % 2 == 0) {
                    firstHalf = rows / 2
                    secondHalf = rows / 2
                } else {
                    firstHalf = rows / 2
                    secondHalf = rows / 2 + 1
                }
                firstHalf * seats * 10 + secondHalf * seats * 8
            }
            println("Number of purchased tickets: $amountOfTickets")
            println("Percentage: $formatPercentage%")
            println("Current income: $$sumOfTickets")
            println("Total income: $$totalIncome")
        } else {
            break
        }
        println("")
    }
}