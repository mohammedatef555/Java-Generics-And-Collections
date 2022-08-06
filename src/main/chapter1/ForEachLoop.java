package main.chapter1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3,4,5);
        for (int i:ints){
            System.out.print(i + " ");
        }
        System.out.println();
        for (Iterator<Integer> it = ints.iterator(); it.hasNext();){
            System.out.print(it.next() + " ");
        }
    }
}
