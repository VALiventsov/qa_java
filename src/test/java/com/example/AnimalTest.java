package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;


@RunWith(Parameterized.class)
public class AnimalTest {

    private final String animalVariant;
    private final List<String> expected;

    public AnimalTest (String animalVariant, List<String> expected) {
    this.animalVariant = animalVariant;
    this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object [] [] getResult() {
        return new Object [] [] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void testGetFood() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood(animalVariant);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFoodException() {
        Animal animal = new Animal();
        try {
            animal.getFood("Кит");
        } catch (Exception thrown) {
            String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
            String actual = thrown.getMessage();
            Assert.assertEquals(expected, actual);
        }
    }

    @Test
    public void shouldReturnFamily() {
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();
        Assert.assertEquals(expected, actual);
    }
}