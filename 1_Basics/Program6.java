/*  Program 6: Write a program to check if a number is even or odd. Take all the values from the user
    Input: var=10;
    Output: 10 is an even no
    Input: var=37;
    Output: 37 is an odd no
*/

import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int var = sc.nextInt();

        if (var % 2 == 0) {
            System.out.println(var + " is an even number");

        } else {
            System.out.println(var + " is an odd number");

        }

        sc.close();

    }

}
