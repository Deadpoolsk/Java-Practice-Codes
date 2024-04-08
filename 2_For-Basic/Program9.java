// 9. Write a program to print the sum of the first 10 odd numbers

public class Program9 {

    public static void main(String[] args) {

        int x = 1;
        int count = 1;
        int sum = 0;
        while (count <= 10) {

            if(x % 2 != 0){

                sum += x;
                count++;
            }
            x++;
        }
        System.out.println(sum);

    }

}
