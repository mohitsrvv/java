public class Qus3 {
    public static void main(String[] args){
        int c = sumRec(3);
        System.out.println(c);
    }
    static int sumRec(int n){
        if(n == 1){
            return n;
        }
        return n + sumRec(n-1);
    }
}
