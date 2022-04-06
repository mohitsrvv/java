import java.util.Scanner;
import java.util.function.IntPredicate;

public class Qus2 {
    public static void main(String[] args){
        byte m1, m2, m3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your physics marks: ");
        m1 = input.nextByte();
        System.out.print("Enter your chemistry marks: ");
        m2 = input.nextByte();
        System.out.print("Enter your maths marks: ");
        m3 = input.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congrats, you are promoted!");
        } else {
            System.out.println("Sorry, but your life is joke!");
        }
    }
}