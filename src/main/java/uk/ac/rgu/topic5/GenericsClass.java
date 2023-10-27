package uk.ac.rgu.topic5;

public class GenericsClass<T>{

    String myString;

    T myType;

    public GenericsClass(T param){
        this.myType = param;
    }

    public void printType(){
        System.out.println(myType.getClass().getSimpleName());
    }
    
}
