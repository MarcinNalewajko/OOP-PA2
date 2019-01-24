package main.Model;

import main.Fuel;

public class CargoShip extends FlyingVehicle {

    private Integer cargoSpaceLoad;

    public Integer getCargoSpaceLoad() {
        return cargoSpaceLoad;
    }


    public CargoShip(String name, String model, Integer yearOfProduction, Integer milage, Fuel fuel, Integer fuelAmount, Integer maxFuelAmount, Status status, Integer cargoSpaceLoad) {
        super(name, model, yearOfProduction, milage, fuel, fuelAmount, maxFuelAmount, status);
        this.cargoSpaceLoad = cargoSpaceLoad;
    }
}
