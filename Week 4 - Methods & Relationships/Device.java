import java.util.ArrayList;

public class Device {

    private String location;
    private String type;
    private int id;
    //Adding ARRAYLIST
    ArrayList<Device> d = new ArrayList<Device>();

    //Default Constructor
    public Device() {

    }

    // Overloaded Constructor
    public Device(String location, String type, int id) {
        this.location = location;
        this.type = type;
        this.id = id;
    }
//GETTER METHODS


    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    //SETTER METHODS


    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    //OVERRIDEN TOSTRING()


    @Override
    public String toString() {
        return "Device{" +
                "location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", id=" + id +
                '}';
    }

    public void display() {
        System.out.println(toString());
    }

    // User-defined methods
    public void actuate() {
        String s = toString();
        System.out.println(s.toUpperCase());

    }

    public void add() {

        //CAN I CALL CONSTRUCTOR HERE??
        d.add(0, new Device());
    }

    void displayalldevices() {
        int i = 0;
        while (d != null) {
            System.out.println(d);
        }

    }
}

