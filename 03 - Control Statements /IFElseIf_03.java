public class IFElseIf_03 {
    public static void main(String[] args){
        int marks = 65;
        if(marks < 50){
            System.out.println("Fail");
        }
        else if(marks >= 50 && marks < 60){
            System.out.prinln("D Grade");
        }
        
        else if(marks >= 70 && marks < 80){
            System.out.println("C grade");
        } 
        else {
            System.out.println("Invalid");
        }
    }
}
