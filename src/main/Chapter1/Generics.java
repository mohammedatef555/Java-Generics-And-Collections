package main.Chapter1;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        // List is an Interface and ArrayList implements this interface
        List<String> words = new ArrayList<>();
        words.add("Hello ");
        words.add("World!");
        String greeting = words.get(0) + words.get(1);
        assert greeting.equals("Hello World!");
    }
}
