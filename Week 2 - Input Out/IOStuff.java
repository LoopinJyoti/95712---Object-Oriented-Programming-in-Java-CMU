import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class IOStuff {
    // Lab3
// Your name: Jyoti Khanchandani
// Your Andrew id: jkhancha

// class IOSTuff
// Tests some issues of input and output


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        String firstName, lastName, ageString, salaryString;
        String id;
        int age;
        double salary;
        String[] data = null;
        String line = null;
    /*        System.out.print("Enter first name: ");
            firstName = scanner.nextLine();
            System.out.print("Enter last name: ");
            lastName = scanner.nextLine();
            System.out.print("Enter id: ");
            id = scanner.nextLine();
            System.out.print("Enter age: ");
             ageString = scanner.nextLine();
                age=Integer.parseInt(ageString);
            System.out.print("Enter salary: ");
            salaryString = scanner.nextLine();
            try
            {
                age=Integer.parseInt(ageString);
                salary=Double.parseDouble(salaryString);
            }
            catch (NumberFormatException e)
            {
                System.out.println(e);
                age=0;
                salary = 0.0;

            }

            System.out.println("First Name = " + firstName);
            System.out.println("Last Name = " + lastName);
            System.out.println("ID = " + id);
            System.out.println("Salary = " + salary);
            System.out.println("Age = " + age);

*/
        System.out.printf("%10s %10s %10s %10s %10s %10s\n", "First Name", "Last Name", "ID", "Age", "Salary", "Category");
        //System.out.printf("%11s %16s %5s %5d %10.2f",firstName,lastName,id,age,salary) ;

        File employeedata = new File("/Users/jyotikhanchandani/IdeaProjects/JAVA-Projects-95712A/Lab3/employee.csv");
        Scanner fileScanner = new Scanner(employeedata);
        int i;
        while (fileScanner.hasNextLine()) {
            line = fileScanner.nextLine();
            data = line.split(",");
            salary = Double.parseDouble(data[4]);
            String category = "null";
            if ((salary < 0) || (salary > 150000)) {
                category = "Error";
            } else if ((salary >= 0) && (salary < 35000)) {
                category = "Low";
            } else if ((salary >= 35000) && (salary <= 70000)) {
                category = "Medium";
            } else if (salary >= 70000) {
                category = "High";
            }
            System.out.printf("%10s %10s %10s %10s %10s %10s\n", data[0], data[1], data[2], data[3], salary, category);
        }



       /* age=Integer.parseInt();
        salary=Double.parseDouble();
        String Category="null"
        if((salary<0) || (salary>150000)
        System.out.println("Error");
        else if ((salary>=0) && (salary<35000))
            System.out.println("Low")
            else if(salary>=35000) && (salary<=70000)
                System.out.println("Medium");
               else if(salary>=70000)
               System.out.println("High");

        */


    }
}

