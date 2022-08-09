package main.Chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardsWithExtends {
    public static void main(String[] args) {
        // -> this will mean extends (either extends or implements)
        // WildCards with extends - <? extends T>
        // List<? extends Number> means that this variable can point to List<Type>
        // Where Type can be Number or any of its subtypes (Integer, Double, Short, etc ..)
        // So List<Integer> is a subtype of List<? extends Number>
        // List<Integer> -> List<? extends Integer> -> List<? extends Number> -> List<?> -> Object
        // if a structure contains elements with a type of the form ? extends E,
        // we can get elements out of the structure, but we cannot put elements into the structure
        // since it might be a list of some other subtype of number.
        // List<? extends Number> doesn't mean this list will contain elements where each element can be Number
        // or any of its subtypes if you need this you can simply use List<Number> directly
        {
            List<Number> numbers = Arrays.asList(1,1.0, new Short("1"));
        }
        //  but it means that this list can point to List<Type> where type can be Number or any of its subtypes
        // remember this is not allowed
        {
            List<Integer> integers = new ArrayList<>();
            // List<Number> numbers = integers; // compile time error because List<Integer> is not subtype of List<Number>
        }
        // but by using wildcards with extends (AKA upper-bound wildcards) we can achieve this
        {
            List<Integer> ints = new ArrayList<Integer>();
            ints.add(1);
            ints.add(2);
            List<? extends Number> nums = ints; // List<Integer> -> List<? extends Integer> -> List<? extends Number>
            // nums.add(3.14);  // compile-time error
            // assert ints.toString().equals("[1, 2, 3.14]");  // uh oh!
        }
    }
}
