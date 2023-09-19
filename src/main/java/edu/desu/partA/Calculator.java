package edu.desu.partA;

public class Calculator {

    /**
     * The addition function.
     * @param x The first operand
     * @param y The second operand
     * @return the sum of x and y
     */
    public double add(double x, double y) {
        return x + y;
    }

    /**
     * The subtraction function
     * @param x The first operand
     * @param y The second operand
     * @return y taken from x
     */
    public double subtract(double x, double y) {
        return x - y;
    }


    /**
     * The multiplication function
     * @param x The first operand
     * @param y The second operand
     * @return x times y
     */
    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y){
        return x / y;
    }

    public double absoluteValue(double input){
        return Math.abs(input);
    }

    public double arcSin(double input){
        return Math.asin(input);
    }

    public double arcCos(double input){
        return Math.acos(input);
    }

    public double arcTan(double input){
        return Math.atan(input);
    }

    public double sin(double input){
        return Math.sin(input);
    }

    public double cos(double input){
        return Math.cos(input);
    }

    public double tan(double input){
        return Math.tan(input);
    }

    public double sqRoot(double input){
        return Math.sqrt(input);
    }
}
