package com.bridgelabz;
/*
    create Generic Class to take in 3 variables of
    Generic Type
 */
public class TestMaximum <T extends Comparable<T>> {

    T x,y,z;
    /*
        Parameter constructor
     */
    public TestMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
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
        /*
            Call method of three variables
         */
        System.out.println(" *** Maximum Of 3 Variables *** ");

        System.out.println("Maximum value of Three Integers is "+maxOfThreeVariables(30,50,70));;
        System.out.println("Maximum value of Three Floats is "+maxOfThreeVariables(2.5f,7.69f,3.24f));
        System.out.println("Maximum value of Three Strings is "+maxOfThreeVariables("Apple","Peach","Banana"));
    }
}
