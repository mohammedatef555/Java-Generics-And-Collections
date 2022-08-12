package main.Chapter4;

class Pair<T, U> {
    private final T first;
    private final U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}

public class DeclaringConstructors {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hi", 1);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        String s = pair.getFirst();
        Integer i = pair.getSecond();
    }

}
