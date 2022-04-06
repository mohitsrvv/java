import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if(age > 18){
            System.out.println("You can drink !");
        } else {
            System.out.println("Nah, you are not able to drink");
        }
    }
}
