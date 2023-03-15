import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + calendar.get(Calendar.MONTH));
        System.out.println("Day: " + calendar.get(Calendar.DATE));
        System.out.println("Date of week: " + calendar.get(Calendar.DAY_OF_WEEK));
        calendar.add(Calendar.DATE, 4);
        System.out.println("4 days later: " + calendar.getTime());
        calendar.add(Calendar.MONTH, -5);
        System.out.println("5 months ago: " + calendar.getTime());
    }
}