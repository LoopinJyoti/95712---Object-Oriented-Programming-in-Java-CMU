import java.util.Arrays;
import java.util.List;
// NAME : JYOTI KHANCHANDANI
// ANDREW ID : jkhancha

public class BadWeekday extends Exception{
    private static final String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    public final static List WEEKDAYS = Arrays.asList(days);
    public BadWeekday() {
        super();
    }
    public BadWeekday(String message) {
        super("Must be one of these: Monday, Tuesday, Wednesday, Thursday, or Friday. " + message);
    }

    public static void problem1(){
        System.out.println("Enter a day of the week");
        String entry = Lab12Driver.scanner.nextLine();

        if(!WEEKDAYS.contains(entry))
        {
            System.out.println("Bad Weekday entered");
        }
        else
        {
            System.out.println(entry);
            System.out.println("Nie job!");
        }

    }

    public static void problem2() throws BadWeekday {

        System.out.println("Enter a day of the week");
        String entry = Lab12Driver.scanner.nextLine();

        if (!BadWeekday.WEEKDAYS.contains(entry)) {
            throw new BadWeekday("Bad day entered");
        } else {
            System.out.println("Nice job!");
        }

        }

        public static void problem3() throws BadWeekday
        {
            try {
                problem2();
            }
            catch(BadWeekday e) {
                System.out.println("Error: " + e.getMessage());

        }
        }

        public static void problem4() throws BadWeekday
        {
        problem2();
        }

        public static void problem5() throws BadWeekday {
            try {
                problem2();
            } catch (BadWeekday e) {
                System.out.println("Caught: " + e.getMessage());
                throw e;
                // Re-throwing the caught exception
            }
        }

    public static void problem6() throws BadWeekday {
        problem2();
    }






    }


