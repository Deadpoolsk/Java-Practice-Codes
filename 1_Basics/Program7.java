/*  Program 7: Write a program, take a number and print whether it is less than 10 or greater */

import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num < 10) {
            System.out.println(num + " is less than 10");
        } else if (num > 10) {
            System.out.println(num + " is greater than 10");
        } else {
            System.out.println(num + " is equal to 10");
        }

        sc.close();

    }

}
