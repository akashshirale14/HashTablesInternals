package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating a Car Object..");
        Car creta = new Car(4,2,4,7);
        Car wagonR = new Car(4,1,5,3);

        System.out.println("HashCode for Creta: " + creta.hashCode());
        System.out.println("HashCode for WagonR " + wagonR.hashCode());

        SampleCar camry = new SampleCar(4,5,6,3);
        System.out.println("HashCode for Camry: " + camry.hashCode());
    }
}
