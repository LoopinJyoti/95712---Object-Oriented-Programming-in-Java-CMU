package NotePackage;

import java.util.Comparator;
public class NumberSorter implements Comparator<Note>
 {
     public int compare(Note n1, Note n2) {
         if(n1.getNoteNumber()== n2.getNoteNumber())
         { return 0;}
         else if (n1.getNoteNumber() > n2.getNoteNumber())
         {
             return 1;
         }
         else return -1;

     }



}
