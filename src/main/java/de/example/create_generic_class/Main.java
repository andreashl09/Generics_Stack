package de.example.create_generic_class;

public class Main {
    public static void main(String[] args) {

        Box<String> box1= new Box<>("Dieter geht Steil....!");
        Box<Integer> box2 = new Box<>(345);

        System.out.println(box1);
        System.out.println(box2);

        BoxWithKeyAndValue<Integer, String> box3 = new BoxWithKeyAndValue<>(23, "The worsted guy is....");
        System.out.println(box3);
    }
}
