package main.chapter1;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodsAndVarargs {
    public static void main(String[] args) {
        // you can pass like this or pass a whole array
        // the type can be inferred or given explicitly
        List<Double> doubles = GenericMethodsAndVarargs.<Double>toList(1.0,2.0);
        List<Integer> ints = toList(1,2,3);
        List<String> stringList = toList("Hello", "World");
        List<Integer> anotherInts = toList(new Integer[] {1,2,3,});
        assert ints.toString().equals(anotherInts.toString());
        System.out.println(ints);
        System.out.println(anotherInts);
        System.out.println(stringList);
    }
    // T... this is called varargs
    // Whenever a vararg is declared, one may either pass a list of arguments
    // to be implicitly packed into an array, or explicitly pass the array directly.
    // Since varargs always create an array, they should be used only when the argument does not have a generic type
    public static <T>List<T> toList(T... arr){
        List<T> list = new ArrayList<>();
        for (T element: arr) list.add(element);
        return list;
    }
}
