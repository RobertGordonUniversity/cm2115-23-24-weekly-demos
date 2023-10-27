package uk.ac.rgu.topic5;

public class LoggerWithEquals implements LogFormat {

    @Override
    public void log(String message) {
        System.out.println("===" + message + "===");
        System.out.println("+++" + message);
        System.out.println("---" + message);
    }
    
}
