import java.util.Scanner;

public class Qus4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your distance in kilometers(KM): ");
        float km = input.nextFloat();
        float mile = 0.621371f * km;
        System.out.println("Your distance in mile: " + mile);
    }    
}
