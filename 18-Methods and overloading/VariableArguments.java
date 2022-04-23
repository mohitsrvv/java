public class VariableArguments {
    static int sum(int ...arr){
        int result = 0;
        for(int a : arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("Welcome to hello world");
        System.out.println("The sum of number 1 and 3: " + sum(1,3));
        System.out.println("The sum of number 55 and 3: " + sum(55, 3));
    }
}
