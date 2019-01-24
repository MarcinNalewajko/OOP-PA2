package main.Model;

import main.Fuel;

public abstract class FlyingVehicle extends Vehicle implements Flyable {


    public FlyingVehicle(String name, String model, Integer yearOfProduction, Integer milage, Fuel fuel, Integer fuelAmount, Integer maxFuelAmount, Status status) {
        super(name, model, yearOfProduction, milage, fuel, fuelAmount, maxFuelAmount, status);
    }

    @Override
    public void fly() {

    }
}
