package Strings;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String myString = new String("This is a string in java");
        String myString2 = "This is a string in java";

        int a[] = new int[] { 1, 2 };

        System.out.println(Arrays.toString(a));
        System.out.println(a.toString());

        if (myString.equals(myString2)) {
            System.out.println("Strings Are Equal");
        }
    }
}
