import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        // int[] marks = new int[3];
        // marks[0] = 1;
        // marks[1] = 22;
        // marks[2] = 33;
        // System.out.println(marks[0]);

        int[] marks = {2, 3, 24, 56, 44, 11};
        System.out.println(marks.length);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        // reverse the aaray
        for(int i=marks.length-1; i>=0; i--){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        // for-each loop
        for(int element : marks){
            System.out.print(element + " ");
        }
        
    }
}
