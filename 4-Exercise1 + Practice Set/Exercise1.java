// Write a program to calculate percentage of a given student in CBSE board exam.
// his marks from 5 subjects must be taken as input from the keyboard.
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Exercise1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your maths marks: ");
        int maths = in.nextInt();
        System.out.print("Enter your english marks: ");
        int english = in.nextInt();
        System.out.print("Enter your social studies marks: ");
        int sst = in.nextInt();
        System.out.print("Enter your science marks: ");
        int science = in.nextInt();
        System.out.print("Enter your hindi marks: ");
        int hindi = in.nextInt();
        int fullMarks = (maths + english + sst + science + hindi)*100/500;
        System.out.println("Your total percentage: " + fullMarks);
    }
}
