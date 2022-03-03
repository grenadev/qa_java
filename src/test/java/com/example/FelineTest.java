package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void eatMeat_positive() throws Exception {
        // Arrange
        Feline feline = new Feline();

        // Act
        List<String> food = feline.eatMeat();

        // Assert
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void eatMeat_negative() throws Exception {
        // Arrange
        Feline feline = new Feline();

        // Act
        List<String> food = feline.eatMeat();

        // Assert
        assertNotEquals(List.of("Бетон", "Картон", "Паралон"), food);
    }

    @Test
    public void getFamily_positive() {
        // Arrange
        Feline feline = new Feline();

        // Act
        String family = feline.getFamily();

        // Assert
        assertEquals("Кошачьи", family);
    }

    @Test
    public void getFamily_negative() {
        // Arrange
        Feline feline = new Feline();

        // Act
        String family = feline.getFamily();

        // Assert
        assertNotEquals("Котячьи", family);
    }

    @Test
    public void getKittens_positive() {
        // Arrange
        Feline feline = new Feline();

        // Act
        int kittens = feline.getKittens();

        // Assert
        assertEquals(1, kittens);
    }

    @Test
    public void getKittens_negative() {
        // Arrange
        Feline feline = new Feline();

        // Act
        int kittens = feline.getKittens();

        // Assert
        assertNotEquals(2, kittens);
    }

    @Test
    public void getKittens_zero() {
        // Arrange
        Feline feline = new Feline();

        // Act
        int kittens = feline.getKittens();

        // Assert
        assertNotEquals(0, kittens);
    }

    @Test
    public void testGetKittens_positive() {
        // Arrange
        Feline feline = new Feline();

        // Act
        int kittens = feline.getKittens(1);

        // Assert
        assertEquals(1, kittens);
    }

    @Test
    public void testGetKittens_negative() {
        // Arrange
        Feline feline = new Feline();

        // Act
        int kittens = feline.getKittens(2);

        // Assert
        assertNotEquals(1, kittens);
    }

    @Test
    public void testGetKittens_zero() {
        // Arrange
        Feline feline = new Feline();

        // Act
        int kittens = feline.getKittens(0);

        // Assert
        assertNotEquals(1, kittens);
    }
}