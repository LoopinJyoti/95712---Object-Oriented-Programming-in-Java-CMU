import java.util.ArrayList;

public class Alarm {
    private String message="";
    private int id=0;
    //DEFAULT CONSTRUCTOR
    public Alarm(){
    }
    // OVERLOADED CONSTRUCTOR
    public Alarm (String message, int id){
        this.message=message;
        this.id=id;

    }
    //GETTER METHODS

    public String getMessage() {
        return message;
    }

    public int getId() {
        return id;
    }
    //SETTER METHODS


    public void setMessage(String message) {
        this.message = message;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    //OVERRIDEN TOSTRING METHOD
    public String toString() {
        return "Alarm{" +
                "message='" + message + '\'' +
                ", id=" + id +
                '}';
    }

    public void display(){
        System.out.println(toString());
    }

    public void soundTheAlarm()
    {
        System.out.println("Calling 911, there has been an emergncy");
    }



    //DISPLAYING ALL ALARMS


}

//LAB 7
