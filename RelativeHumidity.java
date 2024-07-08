import java.util.Scanner;
import java.lang.Math;
// Name: Jyoti Khanchandani
// Your Andrew id: jkhancha
// class RelativeHumidity
// Prompts the user for the temperature and dewpoint in Fahrenheit.
// Converts them to Celsius.
// Computes the saturation for each.
// Computes and displays the relative humidity.
public class RelativeHumidity {
    public static void main(String[] args) {
        // Don't change this code
        RelativeHumidity RelativeHumidity = new RelativeHumidity();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the dewpoint in Fahrenheit: ");
        double dewpoint = scanner.nextDouble();
        System.out.println("You entered:");
        System.out.println("temperature: " + temperature);
        System.out.println("dewpoint: " + dewpoint);
        double CT;
        double dpT;
        double sT;
        double sD;
        double rh;
        // Convert to Celsius
        CT= (5.0/9.0)*(temperature-32);
        System.out.println("The temperature in Celsius is :"+CT);
        dpT=5.0/9.0*(dewpoint-32);
        System.out.println("The dew point in Celsius is:"+dpT);

        // Compute the saturations sT (temperature) and sD (dewpoint)
        sT=Math.exp((17.625*CT)/(243.04+CT));
        System.out.println("The temperature saturation is"+sT);
        sD=Math.exp((17.625*dpT)/(243.04+dpT));
        System.out.println("The dewpoint saturation is"+sD);

        // Compute the relative humidity
        rh=100*(sD/sT);
        System.out.println("The relative humidity is:"+rh);

    }
}
