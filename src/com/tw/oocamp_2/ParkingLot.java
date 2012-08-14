package com.tw.oocamp_2;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    Map<String,Car> cars = new HashMap<String,Car>();
    private int capacity;
    private String id;

    public ParkingLot(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public String park(Car car) {
        if(cars.size()< capacity){
            cars.put(car.getId(),car);
            return car.getId();
        }
        return null;
    }

    public int getCapacity() {
        return capacity;
    }

    public Car pickUp(String carId) {
        return cars.remove(carId);
    }

    public String getId() {
        return id;
    }


    public int getAvailableSize(){
        return this.capacity - cars.size();
    }

}
