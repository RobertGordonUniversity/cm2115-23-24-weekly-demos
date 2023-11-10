package uk.ac.rgu.topic6;

public class Logger {
    
    String name;

    private static Logger instance = null;

    public static Logger getInstance(String name){
        if(instance == null){
            instance = new Logger(name);
        }
        return instance;
    }


    private Logger(String name){
        this.name = name;
    }

    public void print(String message){
        System.out.println(name + ": " + message);
    }

}
