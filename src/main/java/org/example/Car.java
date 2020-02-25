package org.example;

public class Car {
    private String make;
    private String model;
    private String manufactureYear;
    private String engineCapacity;

    public Car(String make, String model, String manufactureYear, String engineCapacity)
    {
        this.make = make;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass())
            return false;

        Car car = (Car) obj;
        return true;
    }

}
