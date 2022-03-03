package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSound() {
        // Arrange
        Cat cat = new Cat(feline);

        // Act
        String sound = cat.getSound();

        // Assert
        assertEquals(sound, "Мяу");
    }

    @Test
    public void getFood() throws Exception {
        // Arrange
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("я", "проверяю", "мок"));

        // Act
        List<String> test = cat.getFood();

        // Assert
        assertEquals(test, List.of("я", "проверяю", "мок"));
    }
}