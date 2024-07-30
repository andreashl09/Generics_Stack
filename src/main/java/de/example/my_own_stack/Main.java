package de.example.my_own_stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>(30);
        System.out.println("Ist der Stack leer?: " + stack.isEmpty());
        stack.push("Der Macker vom Acker");
        stack.push("Looser vom Dienst");
        stack.push("Den Spacken den Jeder kennt");
        System.out.println("Der Peek: " + stack.peek());

        System.out.println(stack.printAll());

        System.out.println("Ist der Stack leer?: " + stack.isEmpty());
        System.out.println("Wurde aus dem Stack entfernt: " + stack.pop());
        System.out.println("Ist der Stack voll? : " + stack.isFull() +"| Max: " + stack.getMax());
        stack.clear();

    }
}
