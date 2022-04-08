import java.util.Scanner;

public class Qus5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your integer: ");
        int num = input.nextInt();
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println("Your fact: " + fact);
    }   
}
