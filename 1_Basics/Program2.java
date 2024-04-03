/*  Program 2: WAP print the value of the below expressions.
    x =9 ;
    ans = ++x + x++ + ++x
    Print ans value and print x
    ans1= ++x + ++x + ++x + ++x
    Print ans1 value and print x
    ans2 = x++ + x++ + ++x + x++ + ++x
    Print ans2 value and print x
    ans3 = x++ + x++ + x++ + x++
    Print ans3 value and print x
*/
public class Program2 {

    public static void main(String[] args) {

        int x = 9;
        int ans = ++x + x++ + ++x;  // 10 + 10 = 20 and x = 11, 20 + 12 = 32.
        System.out.println("ans = " + ans + " , " + "x = " + x);    // 32 and 12

        int ans1 = ++x + ++x + ++x + ++x;   // 13 + 14 + 15 + 16 and x = 16 
        System.out.println("ans1 = " + ans1 + " , " + "x = " + x);  // 58 and 16

        int ans2 = x++ + x++ + ++x + x++ + ++x; // 16 + 17 = 33(x = 18), 33 + 19 = 52(x = 19), 52 + 19 = 71(x = 20), 71 + 21 = 92(x = 21)
        System.out.println("ans2 = " + ans2 + " , " + "x = " + x); // 92 and 21

        int ans3 = x++ + x++ + x++ + x++;   // 21 + 22 + 23 + 24 = 90(x = 25)
        System.out.println("ans3 = " + ans3 + " , " + "x = " + x);   //90 and 25 

    }

}
