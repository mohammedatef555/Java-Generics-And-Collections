package main.Chapter3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ComparableMaxElement {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3);
        Integer max = max(integers);
    }
    public static <T extends Comparable<T>> T max(Collection<T> collection){
        Iterator<T> it = collection.iterator();
        T candidate = it.next();
        while (it.hasNext()){
            T elt = it.next();
            if (candidate.compareTo(elt) < 0)
                candidate = elt;
        }
        return candidate;
    }
}
