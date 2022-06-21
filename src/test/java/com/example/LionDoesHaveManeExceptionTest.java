package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionDoesHaveManeExceptionTest {
        @Mock
        Feline feline;

        @Test
        public void testDoesHaveManeExeption() {
            Assert.assertThrows(Exception.class, () -> new Lion("test", feline));
        }
}
