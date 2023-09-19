package edu.desu.partA;

import edu.desu.partA.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void addTest01(){
        //given
        Calculator calc = new Calculator();
        double inputX = 1;
        double inputY = 2;

        //when
        double expected = 3;
        double actual = calc.add(inputX, inputY);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addTest02(){
        //Given
        Calculator calc = new Calculator();
        double inputX = -75;
        double inputY = 4;

        // when
        double expected = -71;
        double actual = calc.add(inputX, inputY);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void subtractTest01(){
        Calculator calc = new Calculator();
        double x = -7;
        double y = 2;

        double expected = -9;
        double actual = calc.subtract(x,y);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void subtractTest02(){
        Calculator calc = new Calculator();
        double subX = 13;
        double subY = -7;

        double expected = 20;
        double actual = calc.subtract(subX, subY);

        Assertions.assertEquals(expected, actual);
    }
}
