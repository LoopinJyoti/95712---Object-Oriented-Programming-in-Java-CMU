package NotePackage;

public class PoliteTimedMemo extends TimedMemo

{
    String DEFAULT_GREETING = "Dear";
    String DEFAULT_CLOSING = "Yours truly ";

    //DEFAULT CONSTRUCTOR
    public PoliteTimedMemo(){
        super();
    }

    //OVERLOADED CONSTRUCTOR

    public PoliteTimedMemo (String name, String body, String from, String to )
    {
        super(name, body, from, to);

    }

    public String toString(){
       return (DEFAULT_GREETING) +
               "\nName : " + this.name +
               "\nThis note is from : " + this.from +
               "\nThis note is for : " + this.to +
                "\n Body of the note is: " + this.body +
                "\nTimeStamp : " + this.today +
                "\n" + (DEFAULT_CLOSING) +
                "\n" + (FOOTER);
    }



}
