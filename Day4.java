import java.time.Duration;
import java.time.Period;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Day4 {
    public static void main(String args[]) {

        // Date
        Date today = new Date();
        System.out.println("Date: " + today);

        // LocalDate - Returns only the current date
        LocalDate date = LocalDate.now();

        System.out.println("LocalDate: " + date);
        System.out.println("Plus 2 Years: " + date.plusYears(2));
        System.out.println("Minus 2 Years: " + date.minusYears(2));
        System.out.println("Plus 2 Months: " + date.plusMonths(2));
        System.out.println("Minus 2 Months: " + date.minusMonths(2));
        System.out.println("Plus 10 Days: " + date.plusDays(10));
        System.out.println("Minus 10 Days: " + date.minusDays(10));
        System.out.println("Day: " + date.getDayOfMonth());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Month Value: " + date.getMonthValue());
        System.out.println("Year: " + date.getYear());

        // LocalTime - Returns only the current time
        LocalTime time = LocalTime.now();

        System.out.println("LocalTime: " + time);
        System.out.println("Plus 10 Minutes: " + time.plusMinutes(10));
        System.out.println("Minus 10 Minutes: " + time.minusMinutes(10));
        System.out.println("Plus 4 Hours: " + time.plusHours(4));
        System.out.println("Minus 4 Hours: " + time.minusHours(4));
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());

        // LocalDateTime - Returns both current date and current time
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("LocalDateTime: " + dateTime);
        System.out.println("Year: " + dateTime.getYear());
        System.out.println("Month: " + dateTime.getMonth());
        System.out.println("Day: " + dateTime.getDayOfMonth());
        System.out.println("Hour: " + dateTime.getHour());
        System.out.println("Minute: " + dateTime.getMinute());

        // DateTimeFormatter - Formats date and time
        DateTimeFormatter display =
                DateTimeFormatter.ofPattern("EEEE dd MMM yyyy hh:mm a");

        System.out.println("Formatted Date: " + dateTime.format(display));

        // Period - Finds the difference between two dates
        LocalDate start = LocalDate.of(1997, 12, 9);
        LocalDate end = LocalDate.now();

        Period period = Period.between(start, end);

        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());

        // Duration - Calculates the difference between two times
        LocalTime T1 = LocalTime.of(10, 30);
        LocalTime T2 = LocalTime.of(12, 45);

        Duration duration = Duration.between(T1, T2);

        System.out.println("Duration Hours: " + duration.toHours());
        System.out.println("Duration Minutes: " + duration.toMinutes());

        // Calendar - Current date and time
        Calendar cal = Calendar.getInstance();

        System.out.println("Calendar Date: " + cal.getTime());
        System.out.println("Hour: " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
        System.out.println("Second: " + cal.get(Calendar.SECOND));
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1));
        // Jan - 0, Dec - 11
        System.out.println("Day: " + cal.get(Calendar.DAY_OF_MONTH));

        // Calendar - Date calculation
        cal.set(2025, Calendar.DECEMBER, 25);
        cal.add(Calendar.MONTH, -2);
        cal.add(Calendar.DAY_OF_MONTH, 10);

        System.out.println("Calculated Date: " + cal.getTime());
    }
}