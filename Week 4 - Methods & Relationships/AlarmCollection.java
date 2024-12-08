import java.util.ArrayList;

public class AlarmCollection {
    Alarm alarms;
    ArrayList <Alarm> a;

    //DEFAULT CONSTRUCTOR
    public AlarmCollection(){
       a=new ArrayList<Alarm>();
    }

    void add(Alarm anew){
        a.add(anew);
    }

   void displaya() {
        for (int i=0;i<a.size();i++)
        {
        System.out.println(a.get(i));
   }

   }
}

