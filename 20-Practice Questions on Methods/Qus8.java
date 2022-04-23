public class Qus8 {
    public static void main(String[] args){
        patternRec(4);
    }
    static void patternRec(int n){
        if(n>0){
            patternRec(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
