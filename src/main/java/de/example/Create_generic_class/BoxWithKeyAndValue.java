package de.example.Create_generic_class;

import java.util.Objects;

public class BoxWithKeyAndValue<K, V> {

    private K key;
    private V item;

    public BoxWithKeyAndValue(K key, V item) {
        this.key = key;
        this.item = item;
    }

    @Override
    public String toString() {
        return "BoxWithKeyAndValue{" +
                "key=" + key +
                ", item=" + item +
                '}';
    }
}
