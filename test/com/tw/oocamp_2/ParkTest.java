package com.tw.oocamp_2;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/8/12
 * Time: 7:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class ParkTest {

    @Test
    public void can_park_when_have_position() {
        Park park = new Park(5);
        Car car = new Car("abc");
        assertEquals("abc", park.accept(car));
    }

    @Test
    public void can_not_park_when_have_no_position() {
        Park park = new Park(0);
        Car car = new Car("abc");
        assertEquals(null, park.accept(car));
    }

    @Test
    public void should_unpark_accepted_car(){
        Park park = new Park(5);
        Car car = new Car("abc");
        park.accept(car);
        assertEquals(car,park.release("abc"));
    }

    @Test
    public void should_not_unpark_when_not_parked(){
        Park park = new Park(5);
        assertEquals(null,park.release("abc"));
    }


}
