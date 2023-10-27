package uk.ac.rgu.topic5;

public class VerboseLogger implements LogFormat{

    @Override
    public void log(String message) {
        System.out.println("Verbose class: " + message);
    }
    
}
