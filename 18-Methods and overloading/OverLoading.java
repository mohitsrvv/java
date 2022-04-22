public class OverLoading {
    static void change(int[] arr){
        arr[0] = 11;
    }
    static void tellJokes(){
        System.out.println("I invernted a new world\n" + "Hello world");
    }
    public static void main(String[] args){
        tellJokes();
        int[] marks = {22, 42, 42, 425, 435, 353, 5334};
        change(marks);
        System.out.print("changing the value: " + marks[0]);
    }
}
