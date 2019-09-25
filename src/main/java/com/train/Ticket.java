package com.train;

public class Ticket {
    private float numberT;
    private float numberRT;
    Ticket (float numberT, float numberRT) {
        this.numberT = numberT;
        this.numberRT = numberRT;
    }

    public double payForTicket () {
        return 1000 * (numberT - numberRT) + 2000 * 0.9 * numberRT;
    }
}
