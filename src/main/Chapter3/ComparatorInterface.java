package main.Chapter3;

import java.util.Comparator;

public class ComparatorInterface {
    public static void main(String[] args) {
        Comparator<String> stringComparator = (s1, s2) -> s1.length() < s2.length() ? -1 :
                                                          s1.length() > s2.length() ? 1 :
                                                          s1.compareTo(s2);

        System.out.println(stringComparator.compare("Hi", "hello")); // -1
        System.out.println(stringComparator.compare("Hello", "hi")); //  1
        System.out.println(stringComparator.compare("Hi", "pi")); // -1

    }
}
