import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import javax.swing.text.DateFormatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
public class days_of_week {
    public static void main(String[] args){
        LocalDate date=LocalDate.now();
        int count=0;
        while(count<10){
            date=date.plusDays(1);
            if(date.getDayOfWeek()== DayOfWeek.THURSDAY){
                System.out.println(date);
                count++;
            }
        }
    }
}
