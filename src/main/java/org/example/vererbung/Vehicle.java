package org.example.vererbung;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printData(){
        System.out.println("Fahrzeug der Marke "+brand+"mit Modell "+model+ "und Jahr "+year);
    }
}

