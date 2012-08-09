package com.tw.oocamp_2;

import java.util.HashMap;
import java.util.Map;

public class Park {
    Map<String,Car> cars = new HashMap<String,Car>();
    private int capacity;

    public Park(int capacity) {
        this.capacity = capacity;
    }

    public String accept(Car car) {
        if(cars.size()<= capacity){
            return cars.put(car.getId(),car).getId();
        }
        return null;
    }

    public Car release(String carId) {
        return cars.remove(carId);
    }
}
