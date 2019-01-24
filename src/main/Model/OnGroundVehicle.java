package main.Model;

import main.Fuel;

public abstract class OnGroundVehicle extends Vehicle {


    public OnGroundVehicle(String name, String model, Integer yearOfProduction, Integer milage, Fuel fuel, Integer fuelAmount, Integer maxFuelAmount, Status status) {
        super(name, model, yearOfProduction, milage, fuel, fuelAmount, maxFuelAmount, status);
    }
}
