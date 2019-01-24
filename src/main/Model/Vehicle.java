package main.Model;

import main.Fuel;

public class Vehicle {
    private String name;
    private String model;
    private Integer yearOfProduction;
    private Integer milage;
    private main.Fuel fuel;
    private Integer fuelAmount;
    private Integer maxFuelAmount;
    private Status status;



    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public Integer getMilage() {
        return milage;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public Integer getFuelAmount() {
        return fuelAmount;
    }

    public Status getStatus() {
        return status;
    }

    public Integer getMaxFuelAmount() {
        return maxFuelAmount;
    }

    public void setName(String name) {
        if (name.length() < 15 && name.length()>1){this.name = name;}

    }

    public void setModel(String model) {
        if (model.length() < 15 && model.length()>1){this.model = model;}
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        if (yearOfProduction >=0){this.yearOfProduction = yearOfProduction;}
    }

    public void setMilage(Integer milage) {
        if (milage >=0 && milage>=this.milage){this.milage = milage;}
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public void setFuelAmount(Integer fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Vehicle(String name, String model, Integer yearOfProduction, Integer milage, Fuel fuel, Integer fuelAmount, Integer maxFuelAmount, Status status) {
        this.name = name;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.milage = milage;
        this.fuel = fuel;
        this.fuelAmount = fuelAmount;
        this.maxFuelAmount = maxFuelAmount;
        this.status = status;
    }

}
