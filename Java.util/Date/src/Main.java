import java.util.Date;

public class Main {
    public static void main(String[] args) {
        long milliSeconds = System.currentTimeMillis();
        // create variables for current day
        Date dateByCurrentDay = new Date();
        System.out.println("Date by current date: " + dateByCurrentDay);
        System.out.println("------------------------------------------------");
        // create variables for milliseconds
        Date dateByMilliSeconds = new Date(milliSeconds);
        System.out.println("Date by milliSeconds: " + dateByMilliSeconds);
        System.out.println("------------------------------------------------");
        // create variables for a date before the dateByMilliSeconds
        long beforeMilliSeconds = milliSeconds - 24*60*60*1000;
        System.out.println("Date before dateMilliSeconds one date: " + new Date(beforeMilliSeconds));
        System.out.println("------------------------------------------------");
        // create variables for a date after the dateByMilliSeconds
        long afterMilliSeconds = milliSeconds + 24*60*60*1000;
        System.out.println("Date after dateMilliSeconds one date: " + new Date(afterMilliSeconds));
        System.out.println("------------------------------------------------");
    }
}