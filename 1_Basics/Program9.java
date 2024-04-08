/*  Program 9: Write a program, take a number and print whether it is positive or negative. Take all the values from the user
    Input: var=5
    Output: 5 is a positive number
    Input: var=-9
    Output: -9 is a negative number
*/

import java.util.Scanner;

public class Program9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int var = sc.nextInt();

        if (var > 0) {
            System.out.println(var + " is positive number");

        } else if (var < 0) {
            System.out.println(var + " is negative number");

        } else {
            System.out.println(var + " is zero");
        }
        sc.close();
    }

}
