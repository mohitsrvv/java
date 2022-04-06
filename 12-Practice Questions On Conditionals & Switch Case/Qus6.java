import java.util.Scanner;

public class Qus6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your website: ");
        String website = input.nextLine();
        if(website.endsWith(".com")){
            System.out.println("Commerical Website");
        } else if(website.endsWith(".org")){
            System.out.println("Organizational Website");
        } else if(website.endsWith(".in")){
            System.out.println("Indian Website");
        }
    }
}
