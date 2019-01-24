package main.Model;

import main.Fuel;

public class Fighter extends FlyingVehicle {


    private Integer weaponPower;

    public Integer getWeaponPower() {
        return weaponPower;
    }

    public Fighter(String name, String model, Integer yearOfProduction, Integer milage, Fuel fuel, Integer fuelAmount, Integer maxFuelAmount, Status status, Integer weaponPower) {
        super(name, model, yearOfProduction, milage, fuel, fuelAmount, maxFuelAmount, status);
        this.weaponPower = weaponPower;
    }

}
