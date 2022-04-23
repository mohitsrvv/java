public class Qus6 {
    public static void main(String[] args){
        System.out.println("Your avg: " + avg(2,2,2));
    }
    static int avg(int ...arr){
        int n = arr.length;
        int sum = 0;
        for(int i : arr){
            sum = sum + i;
        }
        return (sum/n);
    }
}
