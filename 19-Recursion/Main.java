import java.util.Scanner;

import javax.print.event.PrintEvent;

public class Main {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args){
        System.out.print("Enter your value: ");
        Scanner input = new Scanner(System.in);
        int  n = input.nextInt();
        System.out.println("The factorial of your value: " + factorial(n));
    }
}
