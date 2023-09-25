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

    @Test
    public void dividTest01(){
        Calculator calculator = new Calculator();
        double x = 10;
        double y = 2;

        double expected = 5.0;
        double actual = calculator.divide(x,y);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void divideTest02(){
        Calculator calculator = new Calculator();
        double x = 10;
        double y = 0;

        Assertions.assertThrows(ArithmeticException.class, ()->{
            calculator.divide(x,y);
        });
    }

    @Test
    public void absoluteValTest01(){
        Calculator calculator = new Calculator();
        double result = calculator.absoluteValue(8);
        Assertions.assertEquals(8, result, "abs(8) should equal 8");
    }
    @Test
    public void absoluteValTest02(){
        Calculator calculator = new Calculator();
        double result = calculator.absoluteValue(-10);
        Assertions.assertEquals(10, result, "abs(-10) should equal 10");
    }
    @Test
    public void arcSinTest01(){
        Calculator calculator = new Calculator();
        double input = 0.6;
        double expected = Math.asin(input);
        double result = calculator.arcSin(input);
        Assertions.assertEquals(expected, result, 36.87, "degrees");
    }
    @Test
    public void arcSinTest02() {
        Calculator calculator = new Calculator();
        double input = 0.9;
        double expected = Math.asin(input);
        double result = calculator.arcSin(input);
        Assertions.assertEquals(expected, result, 64.158, "degrees");
    }
    @Test
    public void arcCosTest01() {
        Calculator calculator = new Calculator();
        double input = -1;
        double expected = Math.acos(input);
        double result = calculator.arcCos(input);
        Assertions.assertEquals(expected, result, 180, "degrees");
    }
    @Test
    public void arcCosTest02() {
        Calculator calculator = new Calculator();
        double input = -0.5;
        double expected = Math.acos(input);
        double result = calculator.arcCos(input);
        Assertions.assertEquals(expected, result, 60, "degrees");
    }
    @Test
    public void arcTanTest01() {
        Calculator calculator = new Calculator();
        double input =168;
        double expected = Math.atan(input);
        double result = calculator.arcTan(input);
        Assertions.assertEquals(expected, result, 89.66, "degrees");
    }
    @Test
    public void arcTanTest02() {
        Calculator calculator = new Calculator();
        double input = 67;
        double expected = Math.atan(input);
        double result = calculator.arcTan(input);
        Assertions.assertEquals(expected, result, 87.51, "degrees");
    }
    @Test
    public void SinTest01() {
        Calculator calculator = new Calculator();
        double input = 56;
        double expected = Math.sin(input);
        double result = calculator.sin(input);
        Assertions.assertEquals(expected, result, 0.82903757);
    }
    @Test
    public void SinTest02() {
        Calculator calculator = new Calculator();
        double input = 73;
        double expected = Math.sin(input);
        double result = calculator.sin(input);
        Assertions.assertEquals(expected, result, 0.95630476);
    }
    @Test
    public void CosTest01() {
        Calculator calculator = new Calculator();
        double input = 44;
        double expected = Math.cos(input);
        double result = calculator.cos(input);
        Assertions.assertEquals(expected, result, 0.7193398);
    }
    @Test
    public void CosTest02() {
        Calculator calculator = new Calculator();
        double input = 0.7;
        double expected = Math.cos(input);
        double result = calculator.cos(input);
        Assertions.assertEquals(expected, result, 0.99992537);
    }
    @Test
    public void TanTest01() {
        Calculator calculator = new Calculator();
        double input = 6;
        double expected = Math.tan(input);
        double result = calculator.tan(input);
        Assertions.assertEquals(expected, result, 0.10510424);
    }
    @Test
    public void TanTest02() {
        Calculator calculator = new Calculator();
        double input = 11;
        double expected = Math.tan(input);
        double result = calculator.tan(input);
        Assertions.assertEquals(expected, result, 0.19438031);
    }
    @Test
    public void sqRootTest01() {
        Calculator calculator = new Calculator();
        double input = 32;
        double expected = Math.sqrt(input);
        double result = calculator.sqRoot(input);
        Assertions.assertEquals(expected, result, 5.6568);
    }
    @Test
    public void sqRootTest02() {
        Calculator calculator = new Calculator();
        double input = 10;
        double expected = Math.sqrt(input);
        double result = calculator.sqRoot(input);
        Assertions.assertEquals(expected, result, 3.1622);
    }
}
