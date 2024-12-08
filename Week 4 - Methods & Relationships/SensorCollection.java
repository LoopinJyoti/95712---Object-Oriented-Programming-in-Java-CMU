import java.util.ArrayList;

public class SensorCollection {
    Sensor sensors;
    ArrayList<Sensor> s;

    public SensorCollection() {
        s = new ArrayList<Sensor>();
    }

    void add(Sensor snew) {
        //System.out.println("Adding new Sensor");
        s.add(snew);
    }

    void displays() {
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }

    }
}
