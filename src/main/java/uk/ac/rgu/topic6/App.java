package uk.ac.rgu.topic6;

public class App {
    
    public static void main(String[] args){

        PrintStrategy strategy1 = (input) -> System.out.println(input);
        PrintStrategy strategy2 = (input) ->{
            int count = input.length();
            System.out.println("Message: " + input + "; num chars: " + count);
        };

        MyClass c = new MyClass(strategy1);

        c.printMessage("hello world");

        c.setStrategy(strategy2);

        c.printMessage("hello world");

        PrintStrategy strategy3 = (input) -> {
            System.out.println("Message 3: " + input);
        };

        c.setStrategy(strategy3);
        c.printMessage("Hello world");



    }


}
