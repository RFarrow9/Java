package com.pluralsight.getorganised;

public class CargoFlight extends Flight {
    //int seats = 12; //Can be hidden
    @Override //Not neccessary, but compiler will check this is actually overriding something.
    int getSeats() {return 12;}
    double maxCargoSpace = 100;
    double usedCargoSpace = 0;
    int passengers = 0;

    public CargoFlight() {}

    public CargoFlight(float maxCargoSpace) {
        this.maxCargoSpace = maxCargoSpace;
    }

    public CargoFlight(int flightNumber) {
        super(flightNumber);
    }

    public CargoFlight(int flightNumber, float maxCargoSpace) {
        this(flightNumber); //Better to call the constructor above as opposed to calling the same super
        this.maxCargoSpace = maxCargoSpace;
    }

    public final void add1Package(float h, float w, float d){
        double size = w * h * d;
        if (hasCargoSpace(size)) {
            usedCargoSpace += size;
        }
            else
                handleNoSpace();
    }

    private boolean hasCargoSpace(double size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }

    private void handleNoSpace() {
        System.out.println("Not enough space");
    }



}
