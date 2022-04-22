public class Qus7 {
    public static void main(String[] args){
        int[] arr = {2, 1, 24, 42, 452, 52};
        int min = Integer.MAX_VALUE;
        for(int element : arr){
            if(element < min){
                min = element;
            }
        }
        System.out.println("The min element in array: " + min);
    }
}
