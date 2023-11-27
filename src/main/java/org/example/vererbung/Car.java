package org.example.vererbung;

public class Car extends Vehicle {
    public int amountOfDoors;

    public void setAmountOfDoors(int amountOfDoors) {
        this.amountOfDoors = amountOfDoors;
    }

    public void printData(){
        System.out.println("Fahrzeug der Marke "+getBrand()+" mit Modell "+getModel()+ " und Jahr "+getYear()+" und weil es ein Auto ist: das Auto hat " + amountOfDoors + " Türen");
    }

}