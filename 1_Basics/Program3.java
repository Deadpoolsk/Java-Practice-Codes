/*  Program 3: WAP to find max among 2 numbers. Take all the values from the
    user
    Input : 2 4
    Output: 4
*/

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number = ");
        int x = sc.nextInt();

        System.out.print("Enter the second number = ");
        int y = sc.nextInt();

        if (x > y) {
            System.out.println("max = " + x);
        } else {
            System.out.println("max = " + y);
        }
        sc.close();
    }

}