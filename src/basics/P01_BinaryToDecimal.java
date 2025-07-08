package basics;

import java.util.Scanner;

public class P01_BinaryToDecimal
{
    // Approach one


    public static int B2D_1(int n) {
        int decimal = 0;
        int power = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            decimal += (int) (lastDigit * Math.pow(2, power));
            power++;
            n /= 10;
        }

        return decimal;
    }
    // Approach two by bit manipulation
    public static int B2D(int n){
        int decimal=0;
        int i=0;

    }


    public static void main(String[] args) {
        System.out.println("Binary To decimal");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int n=scanner.nextInt();
        System.out.println("The Decimal number is :" + B2D_1(n));


    }
}
