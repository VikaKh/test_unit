package org.example;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = calculator.addition(5, 6);
        int result2 = calculator.division(12, 6);
        int result3 = calculator.minus(6, 5);
        int result4 = calculator.summary(5, 6);
        //System.out.println(result + "; " + result2 + "; " + result3 + "; " + result4 + ".");
    }
}