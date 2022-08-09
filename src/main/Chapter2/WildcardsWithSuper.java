package main.Chapter2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class WildcardsWithSuper {
    public static void main(String[] args) {
        // <? super Type>
        // a lower bounded wildcard restricts the unknown type to be a specific type or a super type of that type
        List<Object> objectList = Arrays.asList(1,"Hello", 1.1);
        List<Number> numberList = Arrays.asList(1, 2, 3.14);
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.14);

        List<? super Integer> integers = objectList;
        integers = numberList; // List<Number> -> List<? super Number> -> List<? super Integer> -> List<?>
        integers = integerList;
        // integers = doubleList; // this will not work because Double is not a supertype of Integer
        // <? super Type> means that we are expecting a Type capable of holding Type variable
        // But there are no guarantees what type of object you may read from this list

    }
}
