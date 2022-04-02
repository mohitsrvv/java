import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Taking Input from the user !");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Enter your second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of two numbers: " + sum);
    }      
}
