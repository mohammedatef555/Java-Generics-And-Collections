package main.Chapter3.FruityExample;

public class Fruit implements Comparable<Fruit>{
    private Integer size;
    public Fruit(Integer size) {
        this.size = size;
    }
    @Override
    public int compareTo(Fruit that) {
        return this.size.compareTo(that.size);
    }

    public Integer getSize() {
        return size;
    }
}
