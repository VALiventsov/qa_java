package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import java.util.List;

@RunWith(Parameterized.class)
public class LionGetFoodTest {
    private final String lionSex;
    private final List<String> expected;
    public LionGetFoodTest(String lionSex, List<String> expected){
        this.lionSex = lionSex;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object [][] getResult() {
        return new Object[][] {
                {"Самец", List.of("Животные", "Птицы", "Рыба")},
                {"Самка", List.of("Животные", "Птицы", "Рыба")},
        };
    }
    @Test
    public void testGetFood() throws Exception{
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion(lionSex, feline);
        Assert.assertEquals(expected, lion.getFood());
    }
}
