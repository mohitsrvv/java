import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if(age >= 18){
            System.out.println("You are adult now!");
        } else if(age >=15 && age < 18){
            System.out.println("You are teenager!");
        } else {
            System.out.println("You are child focus on study!");
        }
    }
}
