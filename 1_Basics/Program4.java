/*  Program 4: WAP to find min among 2 numbers. Take all the values from the user
    Input : 2 3
    Output: 2
*/

import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number = ");
        int x = sc.nextInt();

        System.out.print("Enter the second number = ");
        int y = sc.nextInt();

        if (x < y) {
            System.out.println("min = " + x);
        } else {
            System.out.println("min = " + y);
        }
        sc.close();
    }

}
