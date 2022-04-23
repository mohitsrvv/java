import java.util.Scanner;

public class Fibo {
    public static void main(String[] args){
        System.out.print("Enter your value: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("The fibo of your value: " + Fibo(n));
    }
    static int Fibo(int n){
        if(n < 2){
            return n;
        }
        return Fibo(n-1) + Fibo(n-2);
    }
}
