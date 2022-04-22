public class Main {
    static int logic(int a, int b){
        int c;
        if(a>b){
            c = a + b;
        } else {
            c = (a+b)*5;
        }
        return c;
    }
    public static void main(String[] args){
        int a = 2, b = 4, c;
        Main obj = new Main();
        c = obj.logic(a, b);
        System.out.println(c);
    }
}

