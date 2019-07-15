package com.pluralsight.getorganised;

public class Flight {
    // other members elided for clarity
    //int seats = 150; //Can be hidden
    private int flightNumber;
    private char flightClass;
    int passengers = 100;

    @Override
    public boolean equals (Object o) {
        if (super.equals(o))
            return true; //if both refs point to the same object
        if(!(o instanceof Flight))
            return false;
        Flight other = (Flight) o;
        return
                flightNumber == other.flightNumber &&
                        flightClass == other.flightClass;
    }
    int getSeats() {return 150;}

    public void add1Passenger() {
        if(hasSeating())
            passengers += 1;
        else
            handleTooMany();
    }

    public int getPassengers() {
        return passengers;
    }

    private boolean hasSeating() {
        return passengers < getSeats();
    }

    private void handleTooMany() {
        System.out.println("Too many passengers");
    }

    public Flight() {
    }

    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
        this.flightClass = flightClass;
    }

}