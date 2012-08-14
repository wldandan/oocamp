package com.tw.oocamp_2;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/9/12
 * Time: 7:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class ParkSmartestAgentTest {
    private ParkAgent agent;

    @Before
    public void setUp(){
        agent = new ParkAgent(new SmartestChooser());
        ParkingLot parkingLot1 = new ParkingLot("1",9);
        ParkingLot parkingLot2 = new ParkingLot("2",10);
        agent.addPark(parkingLot1, parkingLot2);
    }

    @Test
    public void should_park_to_2_when_2_available_size_greater_than_1(){
        Car car1 = new Car("1");
        assertEquals(agent.park(car1), "1:1");
        Car car2 = new Car("2");
        assertEquals("2:2", agent.park(car2));
    }
}
