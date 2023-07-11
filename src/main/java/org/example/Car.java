package org.example;

public class Car {
    int wheels;
    int engineNum;
    int suspensionValue;
    int safetyValue;

    public Car(int wheels, int engineNum, int suspensionValue, int safetyValue) {
        this.engineNum = engineNum;
        this.safetyValue = safetyValue;
        this.wheels = wheels;
        this.suspensionValue = suspensionValue;
    }

    public int hashCode() {
        return 2*wheels + 3*suspensionValue - engineNum + 3*safetyValue;
    }



}
