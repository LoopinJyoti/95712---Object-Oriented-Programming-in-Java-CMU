import java.util.List;
import java.util.Scanner;

public class Lab12Driver {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Reading BadWeekday
        List<String> weekday = BadWeekday.WEEKDAYS;

        for (String element : weekday) {
            System.out.println(element);
        }

        System.out.println("Problem1");
        BadWeekday.problem1();

        System.out.println("Problem2");
        try {
            BadWeekday.problem2();
        } catch (BadWeekday e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Problem3");
        try {
            BadWeekday.problem3();
        }
        catch(BadWeekday e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Problem4");
        try {
            BadWeekday.problem4();
        }
        catch(BadWeekday e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Problem 5");
        try {
            BadWeekday.problem5();
        }
        catch(BadWeekday e) {
            // EXCEPTION CAUGHT
            //System.out.println("Main method caught: " + e.getMessage());
        }

        System.out.println("Problem 6");
        try {
            BadWeekday.problem6();
        } catch (BadWeekday e) {
            throw new RuntimeException(e);
        }

        //throws Runtime Exception which breaks the program from running further




    }
}
