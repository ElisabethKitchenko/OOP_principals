import java.util.Scanner;

//Реализовать класс Time, который позволит удобным образом работать со временем.
//Сделать закрытые поля: часы, минуты, секунды, миллисекунды. Реализовать геттеры и сеттеры со всеми необходимыми проверками на корректность времени.
// Конструктор по умолчанию должен записывать в часы, минуты и секунды нули. Конструктор с тремя параметрами вызывает сеттеры для часов, минут и секунд.
// Конструктор с одним параметром принимает строку вида ’12:30:59’. Применить делегирование конструкторов. Сделать метод, сдвигающий время на указанное
// количество секунд (как вперёд, так и назад). Сделать метод показа текущего времени на экран консоли.
public class Time {

    private static int hours;
    private static int minutes;
    private static int seconds;
    private static int milliseconds;


    @Override
    public String toString() {
        return getHours() + ":" + getMinutes() + ":" + getSeconds() + ":" + getMilliseconds();
    }

    public Time(int hours, int minutes, int seconds) {

        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public Time (String time) {
        // 23:57:11
        setHours(Integer.parseInt(time.substring(0,2)));
        setMinutes(Integer.parseInt(time.substring(3,5)));
        setSeconds(Integer.parseInt(time.substring(6,8)));
    }

    public static void shiftTime(int shiftSeconds){

        int shiftHours = 0, shiftMinutes = 0;

        shiftHours = shiftSeconds/3600;
        shiftMinutes = (shiftSeconds % 3600)/60;
        shiftSeconds = shiftSeconds % 60;

        hours += shiftHours;
        minutes += shiftMinutes;
        seconds += shiftSeconds;

        if (seconds >= 60){
            minutes += seconds/60;
            seconds %= 60;
        }
        else if (seconds < 0 ){
            minutes += seconds/60;
            seconds %= -60;
        }


        if (minutes >= 60){
            hours += minutes/60;
            minutes %= 60;
        }
        else if (minutes < 0){
            hours += minutes/60;
            minutes %= -60;
        }

        if (hours >= 24)
        hours %= 24;
        else
        hours %= -24;


        System.out.println(shiftHours);
        System.out.println(shiftMinutes);
        System.out.println(shiftSeconds);

//        int minutesOverflow = 0, hoursOverflow = 0;
//        seconds += shiftSeconds;
//        if (seconds >= 60)
//           minutesOverflow = seconds / 60;
//        else if (seconds < 0){
//        minutesOverflow = (-1 + (-seconds) / 60);
//        seconds = -seconds;}
//        minutes += minutesOverflow;
//        seconds = seconds % 60;
//
//        if (minutes >= 60 || minutes < 0)
//            hoursOverflow = minutes / 60;
//        hours += hoursOverflow;
//
//        if (hours > 23)
//            hours =  hours % 24;
//        else if (hours < 0)
//            hours *= -1;



    }

    public static int getHours() {
        return hours;
    }

    public static void setHours(int hours) {

        if (hours < 24 )
        Time.hours = hours;
        else
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input correct time");
        hours = scanner.nextInt();
        setHours(hours);
        }
    }

    public static int getMinutes() {
        return minutes;
    }

    public static void setMinutes(int minutes) {
        if (minutes < 60 )
            Time.minutes = minutes;
        else
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input correct time");
            minutes = scanner.nextInt();
            setMinutes(minutes);
        }
    }

    public static int getSeconds() {
        return seconds;
    }

    public static void setSeconds(int seconds) {
        if (seconds < 60 )
            Time.seconds = seconds;
        else
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input correct time");
            seconds = scanner.nextInt();
            setSeconds(seconds);
        }
    }

    public static int getMilliseconds() {
        return milliseconds;
    }

    public static void setMilliseconds(int milliseconds) {
        Time.milliseconds = milliseconds;
    }

    public static void main(String[] args) {
        Time.setHours(20);


        Time myTime = new Time("21:56:56");
        System.out.println(myTime.toString());
        Time.shiftTime(10000);
        System.out.println(myTime.toString());
    }
}
