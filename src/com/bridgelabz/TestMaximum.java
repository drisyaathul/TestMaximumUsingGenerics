package com.bridgelabz;

public class TestMaximum {
    /*
        Three Integers to find the maximum
     */
    public static void maxOfThreeInteger(Integer x, Integer y, Integer z) {
/*
    CompareTo method to test the maximum number
 */
        Integer maximum = x;
        if (y.compareTo(maximum) > 0)
            maximum = y;
        if (z .compareTo(maximum) > 0)
            maximum = z;
        System.out.println(maximum+ " is the maximum of Three Integers");
    }
    public static void main(String[] args) {

        System.out.println(" *** Maximum Of 3 Variables *** ");
        //TC1.1: Given MaximumNumber at first position
        maxOfThreeInteger(60,30, 50);
        //TC1.2: Given MaximumNumber at second position
        maxOfThreeInteger(60,80, 50);
        //TC1.3: Given MaximumNumber at third position
        maxOfThreeInteger(60,30, 70);
    }
}
