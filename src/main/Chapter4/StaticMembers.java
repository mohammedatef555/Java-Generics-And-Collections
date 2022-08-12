package main.Chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Cell<T> {
    private final int id;
    private final T value;
    private static int count = 0;
    private static List<Object> values = new ArrayList<Object>(); // ok
    public static List<Object> getValues() { return values; } // ok
    // private static List<T> values = new ArrayList<T>(); // illegal
    //public static List<T> getValues() { return values; } // illegal

    private static synchronized int nextId() {
        return count++;
    }

    public Cell(T value) {
        this.value = value;
        id = nextId();
    }

    public T getValue() {
        return value;
    }

    public int getId() {
        return id;
    }

    public static synchronized int getCount() {
        return count;
    }


}

public class StaticMembers {
    public static void main(String[] args) {
        {
            // Because generics are compiled by erasure, at run time the classes List<Integer>,
            // List<String>, and List<List<String>> are all implemented by a single class, namely List.
            // You can see this using reflection:
            List<Integer> ints = Arrays.asList(1, 2, 3);
            List<String> strings = Arrays.asList("one", "two");
            System.out.println(ints.getClass() == strings.getClass());
            // Here the class associated with a list of integers at run time is the same as the
            // class associated with a list of strings.
        }
        {
            //One consequence is that static members of a generic class are shared across all instantiations
            // of that class, including instantiations at different types. Static members of a class cannot refer
            // to the type parameter of a generic class, and when accessing a static member the class name should
            // not be parameterized.
            Cell<String> a = new Cell<String>("one");
            Cell<Integer> b = new Cell<Integer>(2);
            System.out.println(a.getId() == 0 && b.getId() == 1 && Cell.getCount() == 2);
            //Static members are shared across all instantiations of a class, so the same count is incremented
            // when allocating either a string or an integer cell.


            //Because static members are independent of any type parameters, we are not permitted to
            // follow the class name with type parameters when accessing a static member:
            Cell.getCount();                // ok
            //Cell<Integer>.getCount(); // compile-time error
            //Cell<?>.getCount();       // compile-time error
        }
    }
}
