import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        LocalDate localDate = LocalDate.now();

        Person person = new Person();

        System.out.println("Date: " + date);
        System.out.println("Calendar: " + calendar.getTime());
        System.out.println("LocalDate: " + localDate);

        person.birthDate = date;
        person.birthCalendar = calendar;
        person.birthLocalDate = localDate;

        System.out.println("사람의 birthDate: " + person.birthDate);
        System.out.println("사람의 birthCalendar: " + person.birthCalendar.getTime());
        System.out.println("사람의 birthLocalDate: " + person.birthLocalDate);

        date.setDate(50);
        calendar.set(Calendar.YEAR, 1980);

        System.out.println("변경 후 사람의 birthDate: " + person.birthDate);
        System.out.println("변경 후 사람의 birthCalendar: " + person.birthCalendar.getTime());
    }
}
