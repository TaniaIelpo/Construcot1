package it.develhope.constructor;

/**
 * This class represents a House
 *
 * @author Tania Ielpo
 */

public class House {

    String address;
    int numberOfFloors;

    public House(String address, int numberOfFloors){
        this.address=address;
        this.numberOfFloors=numberOfFloors;
        System.out.println("A new House Object has been created");
    }
}
