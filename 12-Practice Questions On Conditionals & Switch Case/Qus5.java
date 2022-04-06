import java.util.Scanner;

public class Qus5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your year: ");
        int year = input.nextInt();
        if((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)){
            System.out.println("Leap year");
        } else {
            System.out.println("Not Leap year");
        }
    }
}
