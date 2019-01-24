package test;

import main.Controller.VehicleManager;
import main.Fuel;
import main.Model.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VehicleManagerTest {
    VehicleManager vehicleManager;
    Vehicle vehicle;
    Walker walker;
    OnWheelVehicle onWheel;
    Fighter fighter;
    CargoShip cargo;
    VehicleList vehList;

    @BeforeEach
    public void initEach(){
        vehicleManager = new VehicleManager();
        walker = new Walker("TestVehicle1","TestModel",-10,100, Fuel.antimater,1000,1500, Status.OnDisplay);
        onWheel = new OnWheelVehicle("TestVehicle2","TestModel",-10,100, Fuel.antimater,1000,1500, Status.Rented);
        fighter = new Fighter("TestVehicle3","TestModel",-10,100, Fuel.antimater,1000,1500, Status.OnParking,100);
        cargo = new CargoShip("TestVehicle4","TestModel",-10,100, Fuel.antimater,1000,1500, Status.OnDisplay,100);
        List<Vehicle> list= new ArrayList<>();
        list.add(walker);
        list.add(fighter);
        vehList = new VehicleList(list);

    }

    @Test
    void rentVehicle() {
        vehicleManager.rentVehicle(walker);
        assertEquals(Status.Rented,walker.getStatus());
    }

    @Test
    void returnVehicle() {
        vehicleManager.returnVehicle(onWheel);
        assertEquals(Status.OnParking,onWheel.getStatus());

    }

    @Test
    void moveVehicleOnDisplay() {
        vehicleManager.moveVehicleOnDisplay(fighter);
        assertEquals(Status.OnDisplay,fighter.getStatus());
    }

    @Test
    void moveVehicleToParking() {
        vehicleManager.moveVehicleToParking(cargo);
        assertEquals(Status.OnParking,cargo.getStatus());
    }

    @Test
    void addNewVehicle() {
        vehicleManager.setVehicleList(vehList);
        vehicleManager.addNewVehicle(cargo);
        assertEquals(3,vehList.getVehicleList().size());

    }

    @Test
    void deleteVehicleFromResources() {
        vehicleManager.setVehicleList(vehList);
        vehicleManager.deleteVehicleFromResources(fighter);
        assertEquals(1,vehList.getVehicleList().size());
    }
}