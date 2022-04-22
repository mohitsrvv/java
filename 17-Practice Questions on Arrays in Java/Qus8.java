public class Qus8 {
    public static void main(String[] args){
        // int[] arr = {22, 41, 42, 42, 424, 245, 4245};
        int[] arr = {2, 4, 5, 7, 8, 10, 11};
        boolean isSorted = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }
}
