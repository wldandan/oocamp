package com.tw.oocamp_2;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/8/12
 * Time: 7:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Car {
    private String id;

    public Car(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        Car car = (Car) o;
        return this.id.equals(car.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public String getId() {
        return id;
    }
}
