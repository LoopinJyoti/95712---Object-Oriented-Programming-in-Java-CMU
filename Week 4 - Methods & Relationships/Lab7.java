//JYOTI KHANCHANDANI
//jkhancha

public class Lab7 {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        SensorCollection sc=new SensorCollection();
        AlarmCollection ac=new AlarmCollection();
        Sensor s;
        Alarm a;
        Room room1 = new Room(12.0, 15.0, "kitchen", 1);
        Device d = new Device("fire extinguisher", "kitchen", 1);
        room1.setDevice(d);
        System.out.println();
        int cs = 1;
        //Loop for Sensor Objects
        for (cs = 1; cs <= 5; cs++) {
            s = new Sensor(0.0, 120.0, 68.0, 1.0, "kitchen", "temperature", cs);
            room1.addSensor(s);
        }
        //Loop for Alarm Objects
        int ca=1;
        for(ca=1;ca<=3;ca++)
        {
            a=new Alarm("Ding Ding",ca);
            room1.addAlarm(a);

        }
        room1.display();
        System.out.println();
        Device d1 = new Device ("chemicalFoamer","kitchen", 2);
        room1.setDevice(d1);

        room1.display();



    }
}
