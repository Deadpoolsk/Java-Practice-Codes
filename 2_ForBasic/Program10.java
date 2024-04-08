// 10. Write a program to print the product of the first 10 numbers

public class Program10 {

    public static void main(String[] args) {

        int product = 1;
        for (int i = 1; i <= 10; i++) {

            product *= i;

        }
        System.out.println(product);
    }

}
