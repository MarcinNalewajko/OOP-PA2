package main.Model;

import main.Fuel;

public class OnWheelVehicle extends OnGroundVehicle implements Driveable {


    public OnWheelVehicle(String name, String model, Integer yearOfProduction, Integer milage, Fuel fuel, Integer fuelAmount, Integer maxFuelAmount, Status status) {
        super(name, model, yearOfProduction, milage, fuel, fuelAmount, maxFuelAmount, status);
    }

    @Override
    public void drive() {

    }
}
