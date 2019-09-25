package com.train.kotlin

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets:")
    var numberT = scanner.nextInt()
    println("How many round-trip tickets:")
    var numberRT = scanner.nextInt()
    val ticket = Ticket(numberT, numberRT)
    println("Total tickets:" + numberT + " Round-trip:" + numberRT + " Total:" + ticket.payForTicket())
}

class Ticket (var numberT: Int, var numberRT: Int) {
    fun payForTicket() : Double {
        return (1000 * (numberT - numberRT) + 2000 * 0.9 * numberRT)
    }
}