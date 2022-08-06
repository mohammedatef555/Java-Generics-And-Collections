package main.chapter1;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodsAndVarargs {
    public static void main(String[] args) {
        List<Integer> ints = toList(1,2,3);
        List<String> stringList = toList("Hello", "World");
        List<Integer> anotherInts = toList(new Integer[] {1,2,3,});
        assert ints.toString().equals(anotherInts.toString());
        System.out.println(ints);
        System.out.println(anotherInts);
        System.out.println(stringList);
    }

    public static <T>List<T> toList(T... arr){
        List<T> list = new ArrayList<>();
        for (T element: arr) list.add(element);
        return list;
    }
}
