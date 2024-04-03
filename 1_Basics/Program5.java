/*  Program 5: WAP to take numerical input from the user and find whether the number is
    divisible by 5 and 11. Take all the values from the user
    Input: 55
    Output: 55 is divisible by 5 & 11
    Input: 15
    Output: 15 is not divisible by 5 & 11
*/

import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int x = sc.nextInt();

        if (x % 5 == 0 && x % 11 == 0) {
            System.out.println(x + " is divisible by 5 and 11");

        } else {
            System.out.println(x + " is not divisible by 5 and 11");

        }
        sc.close();
    }

}
