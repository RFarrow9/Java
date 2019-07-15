package com.pluralsight.getorganised;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        //Learning myLearning = new Learning();
        Learning.conditional_assignments();
        Learning.blocks();
        Learning.main();
        Learning.nested_ifs();
        Learning.variable_scope();
        Learning.logical_operators();

        CalcEngine.Engine();

        Learning.loops();
        Learning.arrays();
        Learning.switch_test();

        Flight f1 = new Flight();
        System.out.println(f1.getSeats());

        CargoFlight cf = new CargoFlight();
        System.out.println(cf.getSeats());

        Flight f2 = new CargoFlight();
        System.out.println(f2.getSeats());

        Object[] stuff = new Object[3];
        stuff[0] = new Flight();
        stuff[1] = new Flight();
        stuff[2] = new CargoFlight();

        Object o = new Flight();
        o = new Flight[5]; //we can overwrite the reference o
        o = new CargoFlight(); //but this will only know about object methods/parameters

        //o.add1Passenger(); This won't work

        if (o instanceof CargoFlight) {
            CargoFlight cf1 = (CargoFlight)o;
            cf1.add1Passenger();
        }

        //By default, objects will not be equal
        Flight f8 = new Flight(175);
        Flight f9 = new Flight(175);

        if(f1 == f2) //Reference equals (they are different objects so this is false
            System.out.println("References are equal.");
        else
            System.out.println("References are not equal.");

        if(f8.equals(f9))
            System.out.println("Objects are equal.");
        else
            System.out.println("Objects are not equal.");
        //But we can override the equals method in the Flight class

        //Have to be careful with types however
        Passenger p = new Passenger();
        if(f8.equals(p))
            System.out.println("Objects are equal.");
        else
            System.out.println("Objects are not equal.");

        //Super treats the object as if it were an instance of its base class (treat cargoflight as flight)
        //Useful for accessing base class members that have been overridden

        //Inheritance & Constructors
        CargoFlight cf294 = new CargoFlight(294);



        System.out.println();
        System.out.println("** end program");

    }
}
