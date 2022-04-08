import java.util.Scanner;

public class Qus6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ur integer: ");
        int num = input.nextInt();
        int fact = 1;
        int i = 1;
        while(i <= num){
            fact = fact * i;
            i++;
        }
        System.out.println("your fact: " + fact);
    }
}
