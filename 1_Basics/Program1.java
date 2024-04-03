/*  Write a program to print the value and size of the below variables.Take all
    the values from the user
    num=10  
    chr = ‘S’   
    rs = 55.20
    crMoney = 542154313480.544543
*/

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
// Taking values from user
        System.out.print("Enter the integer value : ");
        int num = sc.nextInt();
        
        System.out.print("Enter the character value : ");
        char ch = sc.next().charAt(0);
        
        System.out.print("Enter the float value : ");
        float rs = sc.nextFloat();
        
        System.out.print("Enter the double value : ");
        double crMoney = sc.nextDouble();

// Printing calues and sizes
        System.out.println("num = " + num + " " + "size of num = " + Integer.SIZE / 8);
        System.out.println("ch = " + ch + " " + "size of ch = " + Character.SIZE / 8);
        System.out.printf("rs = %.2f,size of rs = %d\n", rs, Float.SIZE / 8 );
        System.out.printf("crMoney = %.6f, size of crMoney = %d\n",crMoney, Double.SIZE / 8);

        sc.close();

    }
    
}
