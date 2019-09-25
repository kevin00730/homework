package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickets:");
        float number = scanner.nextInt();
        System.out.println("How many round-trip tickets:");
        float numberRT = scanner.nextInt();
        Ticket ticket = new Ticket(number, numberRT);
        System.out.println("Total tickets:" + number + " Round-trip:" + numberRT + " Total:" + ticket.payForTicket());
    }
}
