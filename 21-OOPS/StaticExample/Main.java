package StaticExample;

public class Main {
    public static void main(String[] args){
        // Human lucifer = new Human(18, "Lucifer", 10000, false);
        // Human sahil = new Human(33, "Sahil", 13000, true);

        // System.out.println(Human.population);
        // System.out.println(Human.population);

        
    }

    // this is not dependent on objects 
    static void fun() {
        // greeting(); // you can't use it becoz it requires an instance 
        // but the func. you are using it in does not depends on instances 

        // you cant access not static stuffs without references their
        // instances in a static context

        // hence, here Iam referencing it
        Main obj = new Main();
        obj.greeting();

    }

    // we know that something which is not static, belongs to an object 
    void greeting() {
        // fun();
        System.out.println("Hello World");
    }
}
