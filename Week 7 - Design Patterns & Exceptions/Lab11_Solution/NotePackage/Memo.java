package NotePackage;

public class Memo extends Note {

    String to;
    String from;
    //DEFAULT CONSTRUCTOR
    Memo(){
    }
    //OVERLOADED CONSTRUCTOR
      Memo (String name, String body, String from, String to)
    {

        super(name,body);
        this.from=from;
        this.to=to;
    }
    public String toString()
    {
        return "Name of Note: " + this.name + "\nThe Note is from:" + this.from + "\nThe Note is for :" + this.to + "\nBody of the Note is :" + this.body + "\n" + FOOTER;
    }

    //Getter for To

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public String getFrom() {
        return from;
    }

}
