import java.util.ArrayList;

public class Room {
    //instances of room
    private double length = 0.0;
    private double width = 0.0;
    private String name = "";
    private int id = 0;
    private Device device;
    private Sensor sensor;
    private Alarm alarm;

   AlarmCollection aa;
   SensorCollection ss;

    ArrayList<Room> r = new ArrayList<Room>();


    //Default Constructor
    public Room() {
        aa=new AlarmCollection();
        ss=new SensorCollection();
    }

    //Overloaded Constructor
    public Room(double length, double width, String name, int id) {
        this.length = length;
        this.width = width;
        this.name = name;
        this.id = id;
        aa=new AlarmCollection();
        ss=new SensorCollection();
    }

    //NEW CONSTRUCTOR()



    //GETTER  METHODS
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Device getDevice() {
        return device;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public Alarm getAlarm() {
        return alarm;
    }
    //SETTER METHODS
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public String toString() {
        return "Room{" +
                "length=" + length +
                ", width=" + width +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", device=" + device.toString() +
                ", sensor=" + sensor +
                ", alarm=" + alarm +
                ", r=" + r +
                '}';
    }


    public void display() {
        System.out.println(toString());
        aa.displaya();
        ss.displays();
    }

    public double getArea() {
        double area = length * width;
        return area;

    }

    //LAB7 METHODS

    public void add(Room room) {
       r.add(room);
    }

    public void addSensor(Sensor s) {
        ss.add(s);
    }
    public void addAlarm(Alarm a) {
        aa.add(a);
    }

    public void addDevice(Device device) {
        this.device = device;
    }

    }



