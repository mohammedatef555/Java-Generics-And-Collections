package main.Chapter3;

import java.math.BigDecimal;

public class ComparableInterface {
    public static void main(String[] args) {
        Integer integer0 = 0;
        Integer integer1 = 1;
        System.out.println(integer0.compareTo(integer1)); // -1 integer0 - integer1

        String s1 = "zero";
        String s2 = "one";
        System.out.println(s1.compareTo(s2)); // > 0 , because zero follows one in alphabetical order

        Number n1 = 1; // Integer
        Number n2 = 1.1; // Double
        // Here the comparison is illegal, because the Number class does not implement the Comparable interface.
        // System.out.println(n1.compareTo(n2));

    }
}
