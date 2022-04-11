public class Qus3 {
    public static void main(String[] args){
        int[] arr = {13, 31, 3, 32, 242, 3};
        int sum = 0;
        for(int element : arr){
            sum = sum + element;
        }
        System.out.println("The avg value of sum is " + sum/arr.length);
    }
}
