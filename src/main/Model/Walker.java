package main.Model;

import main.Fuel;

public class Walker extends OnGroundVehicle implements Walkable{


    public Walker(String name, String model, Integer yearOfProduction, Integer milage, Fuel fuel, Integer fuelAmount, Integer maxFuelAmount, Status status) {
        super(name, model, yearOfProduction, milage, fuel, fuelAmount, maxFuelAmount, status);
    }

    @Override
    public void walk() {

    }
}
