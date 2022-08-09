package main;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3};
        Number[] numbers = integers;
        numbers[2] = 1;
        System.out.println(numbers.toString());
    }
    public static <T> T returnThis(T t) {
        return t;
    }
}
