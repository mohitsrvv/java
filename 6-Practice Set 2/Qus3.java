// use comparison operators to find out whether a given number 
// is greater than the user entered number or not !!

import java.util.Scanner;

public class Qus3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a = input.nextInt();
        System.out.println(a>=7);
    }
}
