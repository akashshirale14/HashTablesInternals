package org.example;

public class SampleCar {
    int wheels;
    int engineNum;
    int suspensionValue;
    int safetyValue;

    public SampleCar(int wheels, int safetyValue, int engineNum, int suspensionValue) {
        this.engineNum = engineNum;
        this.safetyValue = safetyValue;
        this.wheels = wheels;
        this.suspensionValue = suspensionValue;
    }
}
