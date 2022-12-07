import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        //DateTimeFormatter a = DateTimeFormatter.ofPattern("YY - HH:mm");
        DateTimeFormatter a = DateTimeFormatter.ofPattern("dd MMMM yy - HH:mm");
        //System.out.println(today.getDayOfMonth() + " " + today.getMonth() + " " + today.format(a));
        System.out.println(today.format(a));

        //System.out.println(current.getDayOfMonth() + " " + current.getMonth() + " " + current.getYear() + " - " + current.getHour() + ":" + current.getMinute());

        ZonedDateTime todayZoned = ZonedDateTime.now();
        DateTimeFormatter b = DateTimeFormatter.ISO_ZONED_DATE_TIME;
        System.out.println(todayZoned.format(b));
    }
}
