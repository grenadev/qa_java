package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittens_positive() throws Exception {
        // Arrange
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);

        //Act
        int kittens = lion.getKittens();

        //Assert
        Assert.assertEquals(1, kittens);
    }

    @Test
    public void getKittens_negative() throws Exception {
        // Arrange
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);

        //Act
        int kittens = lion.getKittens();

        //Assert
        Assert.assertNotEquals(2, kittens);
    }

    @Test
    public void getKittens_zero() throws Exception {
        // Arrange
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);

        //Act
        int kittens = lion.getKittens();

        //Assert
        Assert.assertNotEquals(0, kittens);
    }

    @Test(expected = Exception.class)
    public void doesHaveMane_exception() throws Exception {
        //Arrange
        Lion lion = new Lion("Неизвестно", feline);

        //Act
        boolean haveMane = lion.doesHaveMane();

    }

    @Test
    public void getFood() throws Exception{
        // Arrange
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        //Act
        List<String> food = lion.getFood();

        //Assert
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

}

