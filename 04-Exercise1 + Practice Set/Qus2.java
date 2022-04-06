// write a program to calculate CGPA using marks of
// three subjects !1

import java.util.Scanner;

public class Qus2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your maths marks: ");
        float maths = input.nextInt();
        System.out.print("Enter your DBMS marks: ");
        float dbms = input.nextInt();
        System.out.print("Enter your physics marks: ");
        float physics = input.nextInt();
        float sum = (maths + dbms + physics)/30;
        System.out.print("Your CGPA: " + sum);
    }
}    
