package com.tw.oocamp_2;

import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/8/12
 * Time: 8:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class ParkAgentTest {

    private ParkAgent agent;

    @Before
    public void setUp(){
        agent = new ParkAgent();
        Park park1 = new Park(5);
        Park park2 = new Park(5);
        agent.addPark(park1, park2);
    }

    @Test
    public void should_park_to_1_when_1_not_full(){

    }

    @Test
    public void should_park_to_2_when_1_is_full(){

    }

    @Test
    public void should_fail_when_both_full(){

    }
}

