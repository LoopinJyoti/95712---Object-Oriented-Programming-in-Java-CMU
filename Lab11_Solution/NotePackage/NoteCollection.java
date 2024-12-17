package NotePackage;

import java.util.ArrayList;
import java.util.Collections;

    public class NoteCollection {

    ArrayList<Note> noteList;

    //DEFAULT CONSTRUCTOR
   public NoteCollection() {
            this.noteList = new ArrayList<>();
       }
       /*
    //FACTORY METHOD NEW:
       public static Note createNote(String type, String name, String body, String from, String to)
       {
           Note nw=null;

           if(type.equals("Memo")) {
               nw = new Memo(name, body, from, to);

           }
           else {
               if (type.equals("TimedMemo")) {
                   nw = new TimedMemo(name,body,from,to );


               } else
                   nw = new PoliteTimedMemo(name,body,from,to);
           }

       return nw;
        }
        */
        public static Note createNote(String type, String name, String body, String from, String to,String printType)
       {
           Note nw=null;

           if(type.equals("Memo")) {

               nw = new Memo(name, body, from, to);

           }
           else {
               if (type.equals("TimedMemo")) {
                   nw = new TimedMemo(name,body,from,to );


               } else
                   //nw = new PoliteTimedMemo(name,body,from,to);
               nw = new PoliteTimedMemo.Builder().body(body).to(to).name(name).from(from).build();

               NoteDisplayer rfnd = new ReallyFancyNoteDisplay();
                    nw.setNoteDisplayer(rfnd);
           }

           if(printType.equals("Simple")) {

               NoteDisplayer nds=new SimpleNoteDsiplay();
               nw.setNoteDisplayer(nds);

           }
           else {
               if (printType.equals("Fancy")) {
                 NoteDisplayer ndf = new FancyNoteDisplay();
                 nw.setNoteDisplayer(ndf);


               }
           }

       return nw;
        }

        public void add(Note n){

        noteList.add(n);
            System.out.println(noteList.size());

    }
    public ArrayList<Note> getAllNotes() {

        System.out.println(noteList.size());
        return noteList;
    }

    public Note getNoteByNumber(int n){



            for (int i=0;i<noteList.size();i++)
            {
                if (n == noteList.get(i).getNoteNumber())
                {
                    return noteList.get(i);

                }


            }
        return null;

    }

        public ArrayList<Note> getNoteByName (String name) {
        ArrayList<Note> ns =new ArrayList<>();
        for (int i=0; i<noteList.size();i++)
        {
            if(noteList.get(i).name.equals(name)){
                ns.add(noteList.get(i));

            }
        }
        return ns;
    }

    // New Method sortByName
        public void sortByName() {

            Collections.sort(noteList);
        }

        public void SortByNumber(){

            Collections.sort(noteList, new NumberSorter());
        }

        public void SortBySize() {

            Collections.sort(noteList, new SizeSorter() );
        }

    }
