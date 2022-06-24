package com.example;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;

import org.junit.runner.RunWith;

@RunWith(MockitoJUnitRunner.class)
public class LionGetKittensCountTest {
    @Mock
    Feline feline;

    @Test
    public void testGetKittensMaleCount() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetKittensFemaleCount() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }
}

