package com.tw.oocamp_1;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class LengthTest {

    @Test
    public void test_1m_equals_1m(){
        Length l1 = new Length(1,"m");
        Length l2 = new Length(1,"m");
        assertTrue(l1.equals(l2));
    }

    @Test
    public void test_1m_equals_100cm(){
        Length l1 = new Length(1,"m");
        Length l2 = new Length(100,"cm");
        assertTrue(l1.equals(l2));
    }

    @Test
    public void test_1m_not_equals_2m(){
        Length l1 = new Length(1,"m");
        Length l2 = new Length(2,"m");
        assertFalse(l1.equals(l2));

    }

    @Test
    public void test_2m_not_equals_100cm(){
        Length l1 = new Length(2,"m");
        Length l2 = new Length(100,"cm");
        assertFalse(l1.equals(l2));
    }

    @Test
    public void test_100cm_equals_1m(){
        Length l1 = new Length(100,"cm");
        Length l2 = new Length(1,"m");
        assertTrue(l1.equals(l2));
    }

    @Test
    public void test_1000mm_equals_1m(){
        Length l1 = new Length(1000,"mm");
        Length l2 = new Length(1,"m");
        assertTrue(l1.equals(l2));
    }
}