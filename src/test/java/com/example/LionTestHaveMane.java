package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class LionTestHaveMane {
    @Mock
    Feline feline;

    private final String haveMane;
    private final boolean expected;


    public LionTestHaveMane(String haveMane, boolean expected) {
        this.haveMane = haveMane;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] lionHaveMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(haveMane, feline);
        //Act
        boolean haveMane = lion.doesHaveMane();

        //Assert
        assertEquals(haveMane, expected);
    }
}