// write a program to sum three number!!

import java.util.Scanner;

public class Qus1 {
    public static void main(String[] args){
        System.out.println("The Sum of three numbers !");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = input.nextInt();
        System.out.print("Enter your second number: ");
        int b = input.nextInt();
        System.out.print("Enter your third number: ");
        int c = input.nextInt();
        int sum = a + b + c;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("The sum of your three numbers: " + sum);
    }
}
