/*  Program 8: Write a program, take a character and print whether it is in UPPERCASE or lowercase. Take all the values from the user
    Input: var = A
    Output: You entered the UPPERCASE character.
 */

import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("You entered the UPPERCASE character");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("You entered lowercase character");
        } else {
            System.out.println("You entered wrong character");
        }

        sc.close();
    }

}
