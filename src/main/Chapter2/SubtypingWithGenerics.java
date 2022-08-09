package main.Chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//PECS: "Producer Extends, Consumer Super".
public class SubtypingWithGenerics {
    public static void main(String[] args) {
        // Substitution Principle
        // Number is a SuperType of Integer, Double and few others
        // So if we have a Number variable it could point to Number (can't here but because it's an abstract class)
        // or any of its subtypes (Integer, Double, Short, etc..)
        {
            Number numberInteger = new Integer(1); // we could just write the value and the compiler will do boxing for us
            Number numberDouble = new Double(2.0);// we could just write the value and the compiler will do boxing for us
            System.out.println(numberInteger);
            System.out.println(numberDouble);
        }
        // So by Substitution Principle you can do this:
        // Number[] numbers = {new Integer(1), new Double(1.0), new Short("1")};
        // and this also:
        {
            List<Number> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2.14);
            numbers.add(3.14f);
            System.out.println(numbers.equals(Arrays.asList(1, 2.14, 3.14f))); // true
        }
        // It may seem reasonable to expect that since Integer is a subtype of Number,
        // it follows that List<Integer> is a subtype of List<Number>. But this is not the case,
        // because the Substitution Principle would rapidly get us into trouble.
        // List<Number> -> List<?> -> Object
        // List<Integer>, List<Number> are not subtypes of List<Object>
        // List<Integer> is not subtype of List<Number> actually both of them is subtype of List<?>
        // List<?> is unbounded wild card - This is called a list of unknown type
        // So you can't have List<Number> reference points to a List<Integer>
        {
            List<Integer> ints = new ArrayList<Integer>();
            ints.add(1);
            ints.add(2);
            // the next line will cause an error
            // List<Number> nums = ints;
        }
        // Array behave differently Integer[] is subtype of Number[]
        {
            Number[] numbers = new Integer[] {1,2,3};
        }

    }
}
