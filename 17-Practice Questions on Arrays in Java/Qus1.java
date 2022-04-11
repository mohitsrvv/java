public class Qus1 {
    public static void main(String[] args){
        float[] marks = {33.3f, 45.2f, 32.6f, 85.5f, 47.5f};
        float sum = 0;
        for(float element : marks){
            sum = sum + element;
        }
        System.out.println("The sum of elements is " + sum);
    }
}
