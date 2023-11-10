package uk.ac.rgu.topic6;

public class MyClass {
    
    PrintStrategy strategy;

    public MyClass(PrintStrategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(PrintStrategy strategy){
        this.strategy = strategy;
    }


    public void printMessage(String input){
        this.strategy.print(input);
    }

}
