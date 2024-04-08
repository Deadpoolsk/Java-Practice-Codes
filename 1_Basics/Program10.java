/*  Program 10: Write a program to check if a character is a vowel or consonant. Take all the values from the user
    Input: var= ”A”;
    Output: A is a vowel.
    Input: var= ”D”;
    Output: D is a consonant
*/

import java.util.Scanner;

public class Program10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
                || ch == 'U' || ch == 'u') {
            System.out.println(ch + " is vowel");
        } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is consonant");
        } else {
            System.out.println("You entered wrong character");
        }
        sc.close();
    }

}
