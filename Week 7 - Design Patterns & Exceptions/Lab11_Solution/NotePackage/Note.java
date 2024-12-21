package NotePackage;

public abstract class Note implements Comparable<Note> {
    // Static data, shared by all objects
    protected static int noteCount = 0;     // Keeps track of # of notes created so far
    protected static final String FOOTER = "***** Powered by Make-A-Note *****";

    // Note data, specific to one object
    protected String name;
    protected String body;
    protected int noteNumber;

    //NoteDislayer
    NoteDisplayer noteDisplayer = null;
    // Default constructor should not be used
    public Note() {

    }

    // Overloaded constructor
    public Note(String name, String body) {
        this.name = name;
        this.body = body;
        noteCount++;                    // Increment how many notes have been created
        this.noteNumber = noteCount;    // Set this note's id to the current count
    }

    // Getters
    public int getNoteNumber() { return noteNumber; }
    public String getName() { return name;}

    // toString for printing
    public String toString() { return "Name: " + name + "\nBody: "
            + body + "\nNote# " + noteNumber + "\n" + FOOTER;}

    // Adding compareTo method
    public int compareTo(Note n) {

        int c= this.name.compareTo(n.name);
        return c;


    }
    // Add a getter method for body

    public String getBody() {
        return body;
    }

    //Abstract getter for to and from
    public abstract String getTo();

    public abstract String getFrom();

    public void display(){
        noteDisplayer.display(this);
    }

    public void setNoteDisplayer(NoteDisplayer noteDisplayer) {
        this.noteDisplayer = noteDisplayer;
    }
}
