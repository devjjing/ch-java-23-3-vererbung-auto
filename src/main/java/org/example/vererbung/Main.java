package org.example.vererbung;

public class Main {
    public static void main(String[] args) {

        Car audir8 = new Car();
        audir8.setBrand("Audi");
        audir8.setModel("R8 4S");
        audir8.setYear(2006);
        audir8.setAmountOfDoors(2);
    }

    public static void printFahrzeug(Vehicle a) {
        System.out.println(a);
    }

}