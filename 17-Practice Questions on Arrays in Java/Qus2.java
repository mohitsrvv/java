public class Qus2 {
    public static void main(String[] args){
        int[] arr = {22, 131, 32, 42, 45, 7};
        int num = 131;
        boolean isInArray = false;
        for(int element : arr){
            if(num == element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("Its in the array");
        } else {
            System.out.println("Its not in the array");
        }
    }
}
