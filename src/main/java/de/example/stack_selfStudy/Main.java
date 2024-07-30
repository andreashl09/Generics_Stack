package de.example.stack_selfStudy;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Deadpool");
        stack.push("Wolverine");
        stack.push("Super Sonic");

        System.out.println("Der Peek vom Stapel ist: " + stack.peek());
        System.out.println("Der Pop vom Stapel ist: " + stack.pop());
        System.out.println("Die Größe des Stacks ist: " + stack.size());
        stack.clear();
        System.out.println("Ist das Stack leer: " + stack.isEmpty());

    }
}
