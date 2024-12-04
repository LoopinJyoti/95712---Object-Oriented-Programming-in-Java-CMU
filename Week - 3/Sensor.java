public class Sensor {
    //Instance Variables
    private double minimum=0.0;
    private double maximum=0.0;
    private double currentValue=0.0;
    private double interval =0.0;
    private String location="";
    private String type="";
    private int id=0;
//Default Constructor
    public Sensor() {
    }

    //GETTER METHODS

//Overloaded Constructor
    public Sensor(double minimum, double maximum, double currentValue,double interval,String location, String type, int id){
        this.minimum=minimum;
        this.maximum=maximum;
        this.currentValue=currentValue;
        this.interval=interval;
        this.location=location;
        this.type=type;
        this.id=id;
    }

    //GETTER METHODS
    public double getMinimum() {
        return minimum;
    }

    public double getMaximum() {
        return maximum;
    }
    public double getCurrentValue() {
        return currentValue;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public double getInterval() {
        return interval;
    }

    // SETTER METHODS
    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }

    public void setMaximum(double maximum) {
        this.maximum = maximum;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    //OVERRIDDEN TOSTRING() METHOD


    @Override
    public String toString() {
        return "Sensor{" +
                "minimum=" + minimum +
                ", maximum=" + maximum +
                ", currentValue=" + currentValue +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", id=" + id +
                '}';
    }

    public void display(){
        System.out.println(toString());
    }

    // boolean trip() function
    public boolean trip()
    {
        if((currentValue<minimum) || (currentValue>maximum)) {
            return true;
        }
        return false;     }

}
