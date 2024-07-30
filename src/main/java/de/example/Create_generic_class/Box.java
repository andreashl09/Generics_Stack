package de.example.Create_generic_class;

public class Box<E> {
    private E item;

    public Box(E item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Box{" +
                "item=" + item +
                '}';
    }
}
