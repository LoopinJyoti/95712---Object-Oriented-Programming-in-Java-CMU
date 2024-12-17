package NotePackage;

public class ReallyFancyNoteDisplay extends NoteDisplayer{


    @Override
    public void display(Note plm){
        if(plm instanceof PoliteTimedMemo) {
            System.out.println("Dear");
            System.out.println("Yours truly");
            FancyNoteDisplay fmd=new FancyNoteDisplay();
            //plm.setNoteDisplayer(fmd);
            fmd.display(plm);
        }



    }

}
