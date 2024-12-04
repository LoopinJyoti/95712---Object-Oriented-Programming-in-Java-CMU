//Name : JYOTI KHANCHANDANI
//Andrew ID: jkhancha

import java.util.*;
public class Lab5 {
    public static void main(String[] args) {

        //EXISTING CODE
        Room room1 = new Room(12.0, 15.0, "kitchen", 1);
        Device extinguisher = new Device("fire extinguisher", "kitchen", 1);
        room1.addDevice(extinguisher);
        for (int i = 0; i < 5; i++) {
            Sensor s = new Sensor(0.0, 120.0,
                    68.0, 1.0, "kitchen",
                    "temperature", i+1);
            room1.addSensor(s);
        }
        for (int i = 0; i < 3; i++) {
            Alarm a = new Alarm("Ding! Ding!", i+1);
            room1.addAlarm(a);
        }
        room1.display();
        Device chemicalFoamer = new Device("chemical foamer", "kitchen", 2);
        room1.addDevice(chemicalFoamer);
        room1.display();
// MY CODE
        Scanner sc = new Scanner(System.in);
        Sensor temperature = new Sensor(0.0, 120.0, 68.0, 1.0, "kitchen", "type", 1);
        // Device extinguisher = new Device("fire extinguisher", "kitchen", 1);
        Room kitchen = new Room(12.0, 15.0, "kitchen", 1);
        Alarm bell = new Alarm("Ding!Ding!", 1);

        //DISPLAYING ALL OBJECTS

        temperature.display();
        extinguisher.display();
        kitchen.display();
        bell.display();

        //DISPLAYING WELCOME MESSAGE

        System.out.println("Welcome to our LAB5 for JAVA");

        //DISPLAYING ROOM INFO
        //System.out.println(kitchen.toString());
        //QUESTION 7
        String q = "";
        double newt;
        boolean test;
        boolean loopt = true;
        double temp;
        while (loopt) {
            System.out.println("Do you want to enter a new value");
            q = sc.next();
            q = q.toUpperCase();
            if (q.equals("Y")) {
                loopt = true;
            } else {
                loopt = false;
                break;
            }
            System.out.println("Tesing loop condition" + loopt);

            System.out.println("The current temperature is" + temperature.getCurrentValue());
            temp = temperature.getCurrentValue();
            System.out.println("Reset temperature to:");
            newt = sc.nextDouble();
            temperature.setCurrentValue(newt);
            test = temperature.trip();
            //System.out.println("Tesing loop condition"+loopt);
            if (test) {
                extinguisher.actuate();
                bell.soundTheAlarm();
                temperature.setCurrentValue(temp);
            }
            System.out.println("End of Iteration");
        }


        System.out.println("The  changed temperature is: " + temperature.getCurrentValue());

// QUESTION 8
 /*  There are four related classes. How should they be organized?
        Since Room is the major class with all other objects. They should be organized as :
        -->Room
            --> Device --> Sensor --> Alarm
            --> Main (Lab5)
 And how should they communicate with each other?
            They communicate with each other with the help of objects of each class.

(a.) why you decided on this organization
        Because in terms of function Room is where all the other objects can also be created.

(b.) how the communication in main's loop would occur – which object/method would main
        call, then which object/method would that call, to get all the same work done.

        Main calls the Sensor object for creation.
        Then it calls a room object to intialise the sensor object as part of Room.
        Similarly in the 2nd loop,
        Main calls and creates a Device object which then creates a Device instance in the Room Class.
        It also creates a similar case with the Alarm object.
*/


    }
}