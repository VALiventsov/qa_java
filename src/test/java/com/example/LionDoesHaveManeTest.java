package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;

@RunWith(Parameterized.class)
public class LionDoesHaveManeTest {
    Feline feline;
    private final String lionSex;
    private final boolean expected;

    public LionDoesHaveManeTest(String lionSex, boolean expected) {
        this.lionSex = lionSex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getResult() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(lionSex, feline);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(expected, actual);
    }

}
