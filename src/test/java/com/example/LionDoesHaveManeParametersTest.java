package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class LionDoesHaveManeParametersTest {
    private final String lionSex;
    private final boolean expected;
    public LionDoesHaveManeParametersTest (String lionSex, boolean expected) {
        this.lionSex = lionSex;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object [][] getResult() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void testDoesHaveMane() {
        Lion lion = Mockito.mock(Lion.class);
        Mockito.when(lion.doesHaveMane()).thenReturn(expected);
        Assert.assertEquals(expected, lion.doesHaveMane());
    }
}
