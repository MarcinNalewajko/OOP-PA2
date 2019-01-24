package main.Controller;

import main.Model.Status;
import main.Model.Vehicle;
import main.Model.VehicleList;

import java.util.List;

public class VehicleManager {
    private VehicleList vehicleList;

    public VehicleList getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(VehicleList vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void rentVehicle(Vehicle vehicle) {vehicle.setStatus(Status.Rented);
    }

    public void returnVehicle(Vehicle vehicle) {vehicle.setStatus(Status.OnParking);
    }

    public void moveVehicleOnDisplay(Vehicle vehicle) {vehicle.setStatus(Status.OnDisplay);
    }

    public void moveVehicleToParking(Vehicle vehicle) {vehicle.setStatus(Status.OnParking);
    }

    public void addNewVehicle(Vehicle vehicle) {vehicleList.getVehicleList().add(vehicle);
    }

    public void deleteVehicleFromResources(Vehicle vehicle) {
        vehicleList.getVehicleList().remove(vehicle);

    }

}
