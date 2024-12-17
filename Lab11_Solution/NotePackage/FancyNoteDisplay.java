package NotePackage;

public class FancyNoteDisplay extends NoteDisplayer{

    public void display(Note note) {
        int s=note.body.length();
        if(s>25){
            s=25;
        }
        else
            s=s+15;

        int i=0;
        for(i=0;i<s;i++){
            System.out.print("*");
        }
        System.out.println();

        //Printing middle values
        String a="* Number:" + note.getNoteNumber();
        int nl= a.length();
        int dnl=s-nl-1;

        System.out.print("* Number:"+ note.getNoteNumber());
        for(i=0; i<dnl; i++)
        {
            System.out.print(" ");
        }
        System.out.println("*");
        String b="* Name: " +  note.getName();
        int nml=b.length();
        int nnml=s-nml;

        System.out.print("* Name:"+ note.getName() );
        for(i=0; i<nnml; i++)
        {
            System.out.print(" ");
        }
        System.out.println("*");
        String c="* From : " +  note.getFrom();
        int fl=c.length();
        int ffl=s-fl;
        System.out.print("* From: "+ note.getFrom());
        for(i=0; i<ffl; i++)
        {
            System.out.print(" ");
        }
        System.out.println("*");

        String d="* To : " +  note.getTo();
        int tl=d.length();
        int ttl=s-tl;
        System.out.print("* To :" + note.getTo());
        for(i=0; i<ttl; i++)
        {
            System.out.print(" ");
        }
        System.out.println("*");

        for(i=0;i<s;i++){
            System.out.print("*");
        }
        System.out.println();

        //Printing Body
        System.out.println("* Body :" + note.getBody());








            }
        }
