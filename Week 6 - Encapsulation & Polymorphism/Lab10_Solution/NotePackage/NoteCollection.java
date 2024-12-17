package NotePackage;

import java.util.ArrayList;
import java.util.Collections;

public class NoteCollection {

ArrayList<Note> noteList;

//DEFAULT CONSTRUCTOR

    public NoteCollection() {
        this.noteList = new ArrayList<>();
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
