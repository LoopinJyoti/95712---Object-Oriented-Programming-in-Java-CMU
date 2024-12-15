package NotePackage;
import java.time.*;
public class TimedMemo extends Memo {
    String today;

    //DEFAULT CONSTRUCTOR
    public TimedMemo(){
        super();

    }
    //OVERLOADED CONSTRUCTOR
    public TimedMemo(String name, String body, String from, String to ){
        super(name,body,from,to);
        this.today=LocalDate.now().toString();

    }

    public String toString(){
        return "Name : " + this.name + "\nThis note is from : " + this.from + "\nThis note is for : " + this.to + "\nBody of the Note is:"+ this.body + "\nTimeStamp : " + this.today + "\n"+ FOOTER;
    }
}
