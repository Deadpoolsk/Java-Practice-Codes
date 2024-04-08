/*  1. Write a program to print the first 10 capital Alphabets. */

public class Program1 {

    public static void main(String[] args) {

        char ch = 'A';
        int x = 65;
        for (int i = 1; i < 11; i++) {
            System.out.println((char) x++ + " ");
            System.out.println(ch++ + " ");
        }

    }

}
