package NotePackage;

import java.util.Comparator;

public class SizeSorter implements Comparator<Note> {
    public int compare (Note n1, Note n2){
        int l1 = n1.toString().length();
        int l2 = n2.toString().length();
        return Integer.compare(l1,l2);

    }

}
