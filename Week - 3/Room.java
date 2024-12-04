import java.util.ArrayList;

public class Room {
    //instances of room
    private double length=0.0;
    private double width=0.0;
    private String name="";
    private int id=0;
    private Device device;
    private Sensor sensor;

    private Alarm alarm;
    private ArrayList alarmList = new ArrayList<>();
    private ArrayList sensorList = new ArrayList<>();


    //Default Constructor
    public Room() {
    }

    //Overloaded Constructor
    public Room(double length, double width, String name, int id) {
        this.length = length;
        this.width = width;
        this.name= name;
        this.id=id;
    }

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

    public ArrayList getAlarmList() {
        return alarmList;
    }

    public ArrayList getSensorList() {
        return sensorList;
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

    public void setAlarmList(ArrayList alarmList) {
        this.alarmList = alarmList;
    }

    public void setSensorList(ArrayList sensorList) {
        this.sensorList = sensorList;
    }

    @Override
    public String toString() {
        return "Room{" +
                "length=" + length +
                ", width=" + width +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public void display(){
        System.out.println(toString());
    }
    public void addDevice(Device device)
    {
        this.device = device;
    }
    public void addSensor(Sensor sensor)
    {
        this.sensor = sensor;
    }
    public void addAlarm(Alarm alarm)
    {
        this.alarm = alarm;
    }


    public double getArea(){
         double area=length*width;
                return area;

    }

    //Over

}
