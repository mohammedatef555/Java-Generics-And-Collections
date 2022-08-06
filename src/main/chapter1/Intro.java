package main.chapter1;

import java.util.Arrays;
import java.util.List;

public class Intro {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3);
        int s = 0;
        for(int n: ints) {
            s += n;
        }
        assert s == 6;
    }
}
