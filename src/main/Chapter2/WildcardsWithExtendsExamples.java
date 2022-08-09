package main.Chapter2;

import java.util.Arrays;
import java.util.List;

public class WildcardsWithExtendsExamples {
    public static void main(String[] args) {
        // How useful  ( Upper Bounded Wildcards <? extends Type> ) ?
        List<Number> numberList = Arrays.asList(1, 2, 3.14);
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.14);
        {
            printWithNoExtendParameter(numberList); // this will work fine
            // The 2 below calls will not work and will throw compile time error because
            // the numberList parameter in printWithNoExtendParameter method expects List<Number>
            // and integerList is of type List<Integer> which is not subtype of List<Number>
            // and doubleList is of type List<Double> which is not subtype of List<Number>
            // printWithNoExtendParameter(integerList);
            // printWithNoExtendParameter(doubleList);
        }
        {
            // They all work with no error because
            // List<Number> is subtype of List<? extends Number>
            // List<Integer> is subtype of List<? extends Number>
            // List<Double> is subtype of List<? extends Number>
            printWithExtendParameter(numberList); // works
            printWithExtendParameter(integerList); // works
            printWithExtendParameter(doubleList); // works
        }
    }

    public static void printWithNoExtendParameter(List<Number> numberList) {
        for (Number number : numberList) {
            System.out.println(number);
        }
    }
    public static void printWithExtendParameter(List<? extends Number> numberList) {
        for (Number number : numberList) {
            System.out.println(number);
        }
    }
}
