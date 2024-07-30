package de.example.my_own_stack;

import java.util.ArrayList;

public class Stack<E> {

    private final int max;
    private int size = 0;
    private final ArrayList<E> stack;

    public Stack(int max) {
        this.max = max;
        stack = new ArrayList<>();
    }

    public int getMax(){
        return max;
    }

    public E push(E item) {
        if (size >= max) throw new StackOverflowError();
        stack.add(size,item);
        ++size;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E peek() {
        if(size == 0) throw new StackOverflowError();
        return stack.get(size-1);
    }

    public E pop() {
        E lastItem = stack.get(size-1);
        --size;
        return lastItem;
    }

    public int size() {
        return size;
    }

    public void clear() {
        size = 0;
    }

    public boolean isFull(){
        return (size >= max);
    }

    public StringBuilder printAll(){
        StringBuilder sb = new StringBuilder();
        if(size == 0) return sb.append("Stack ist leer!");
        sb.append("Mein Stack:\n");
        for (int i = 0; i < size; i++) {
            sb.append(stack.get(i)).append("\n");
        }
        return sb;
    }



}
