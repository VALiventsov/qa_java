package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import java.util.List;

public class LionTest {

    @Test
    public void testGetKittens() {
        Lion lion = Mockito.mock(Lion.class);
        Mockito.when(lion.getKittens()).thenReturn(new Feline().getKittens());
        Assert.assertEquals(new Feline().getKittens(), lion.getKittens());
    }

    @Test
    public void testDoesHaveManeExeption() {
        Lion lion = Mockito.mock(Lion.class);
        try {
            lion.doesHaveMane();
        } catch (Exception thrown) {
            String expected = "Используйте допустимые значения пола животного - самей или самка";
            String actual = thrown.getMessage();
            Assert.assertEquals(expected, actual);
        }
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = Mockito.mock(Lion.class);
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}