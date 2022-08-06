package main.chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxingAndUnboxing {
    public static void main(String[] args) {
        Integer integer = 1; // this is boxing
        int i = integer; // this is unboxing
        List<Integer> nums = Arrays.asList(100, 200, 300);

        assert sum(nums) == sum(nums);
        assert sumInteger(nums).equals(sumInteger(nums));
        assert sumInteger(nums) == sumInteger(nums); // not recommended
        // In the first assertion, unboxing causes values to be compared,
        // so the results are equal. In the second assertion, there is no unboxing,
        // and the two method calls return distinct Integer objects, so the results are unequal
        // even though both Integer objects represent the same value, 600.
        // We recommend that you never use == to compare values of type Integer.
        // Either unbox first, so == compares values of type int, or else use equals to compare values of type Integer
    }

    // why Integer not int because type parameters must always be bound to reference types, not primitive types
    public static int sum(List<Integer> ints) {
        int s = 0;
        for (int n : ints) s += n;
        return s;
    }

    public static Integer sumInteger(List<Integer> ints) {
        Integer s = 0;
        for (Integer n : ints) s += n;// each time unbox s and n do the addition and boxes the result again
        return s;
    }
}
