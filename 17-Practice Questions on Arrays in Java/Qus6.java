public class Qus6 {
    public static void main(String[] args){
        int[] arr = {22, 41, 46, 67, 88, 99, 100};
        int max = 0;
        for(int element : arr){
            if(element > max){
                max = element;
            }
        }
        System.out.println("The max element in the arr: " + max);
    }
}