package com.bridgelabz;

public class TestMaximum {
    /*
        Ensure the Generic Type extends Comparable
     */
    public static <T extends Comparable<T>> T maxOfThreeVariables(T x, T y, T z) {
/*
    CompareTo method to test the maximum of three variables
 */
        T maximum = x;
        if (y.compareTo(maximum) > 0)
            maximum = y;
        if (z.compareTo(maximum) > 0)
            maximum = z;
        return maximum;
    }

    public static void main(String[] args) {

        System.out.println(" *** Maximum Of 3 Variables *** ");
        //Printing the Call methods
        System.out.println("Maximum value of Three Integers is "+maxOfThreeVariables(30,50,70));;
        System.out.println("Maximum value of Three Floats is "+maxOfThreeVariables(2.5f,7.69f,3.24f));
        System.out.println("Maximum value of Three Strings is "+maxOfThreeVariables("Apple","Peach","Banana"));

    }
}
