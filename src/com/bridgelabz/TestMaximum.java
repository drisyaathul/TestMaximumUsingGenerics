package com.bridgelabz;

public class TestMaximum {
    /*
        Maximum of Three Variables
     */
    public static void maxOfThreeInteger(Integer x, Integer y, Integer z) {
/*
    find the maximum of three Integer
    CompareTo method to test the maximum number
 */
        Integer maximum = x;
        if (y.compareTo(maximum) > 0)
            maximum = y;
        if (z .compareTo(maximum) > 0)
            maximum = z;
        System.out.println(maximum+ " is the maximum of Three Integers");
    }
    public static void maxOfThreeFloats(Float x, Float y, Float z) {
/*
    find the maximum of three Floats
    CompareTo method to test the maximum number
 */
        Float maximum = x;
        if (y.compareTo(maximum) > 0)
            maximum = y;
        if (z .compareTo(maximum) > 0)
            maximum = z;
        System.out.println(maximum+ " is the maximum of Three Integers");
    }
    public static void main(String[] args) {

        System.out.println(" *** Maximum Of 3 Variables *** ");
        /*
            Find the maximum of three Integers
         */
        System.out.println("Maximum of Three Integers :-");
        //TC1.1: Given MaximumNumber at first position
        maxOfThreeInteger(60,30, 50);
        //TC1.2: Given MaximumNumber at second position
        maxOfThreeInteger(60,80, 50);
        //TC1.3: Given MaximumNumber at third position
        maxOfThreeInteger(60,30, 70);
        /*
            Find the maximum of three Floats
         */
        System.out.println("Maximum of Three Floats :-");
        //TC1.1: Given MaximumNumber at first position
        maxOfThreeFloats(5.87f,1.55f,3.28f);
        //TC1.2: Given MaximumNumber at second position
        maxOfThreeFloats(3.82f,5.69f,1.2f);
        //TC1.3: Given MaximumNumber at third position
        maxOfThreeFloats(2.53f,3.25f,7.6f);
    }
}
