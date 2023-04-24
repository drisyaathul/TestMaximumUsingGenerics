package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

/*
    Create Generic Class to take in 3 variables of
    Generic Type
 */
public class TestMaximum <T extends Comparable<T>> {
    //Initializing
    T x,y,z;
    /*
        Parameter constructor
     */
    public TestMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    /*
        Multiple Variables in One Generic Method to find maximum
     */
    public static <T extends Comparable<T>> T maxOfMultipleVariables(T... x) {
/*
    List of elements are added in the Array as variableArray and using
    CompareTo method to test the maximum of multiple variables
 */
        T maximum = x[0];
        List<T> variableArray = new ArrayList<T>();
        for (T element : x) {
            variableArray.add(element);
            if (element.compareTo(maximum) > 0) {
                maximum = element;
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        /*
            Call method to take multiple parameters
         */
        System.out.println(" *** Test Maximum *** ");

        System.out.println("Maximum value of Integers is "+maxOfMultipleVariables(30,50,70,60,90));
        System.out.println("Maximum value of Floats is "+maxOfMultipleVariables(2.5f,7.69f,3.24f,8.9f,1.29f));
        System.out.println("Maximum value of Strings is "+maxOfMultipleVariables("Apple","Peach","Banana","Orange","Pineapple"));
    }
}
