package org.example.vererbung;
public class Main{
    public static void main(String[] args){



        Auto audir8 = new Auto();
        audir8.setBrand("Audi");
        audir8.setModel("R8 4S");
        audir8.setYear(2006);
    }
    public static void printFahrzeug(Fahrzeug a) {
        System.out.println(a);
    }
}