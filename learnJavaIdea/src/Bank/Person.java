package Bank;

import java.util.ArrayList;

public class Person {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("hello");
        al.add(1, "hey");
        boolean contains = al.contains("hey");
        System.out.println(al);
        System.out.println(contains);
    }
}
