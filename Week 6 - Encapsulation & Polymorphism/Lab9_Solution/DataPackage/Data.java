package DataPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Data {
    private int iValue = 10;
    private String sValue = "a string";
    private int[] iList = {12, 15, 20};
    private ArrayList<Integer> aList = new ArrayList<>();
    private ContainedClass containedClass = new ContainedClass();

// Adding Getters and Setters

    public int getiValue() {
        return iValue;
    }

    public String getsValue() {
        return sValue;
    }

    public int[] getiList() {
        return iList;
    }

    public ArrayList<Integer> getaList() {
        return aList;
    }

    public ContainedClass getContainedClass() {
        return containedClass;
    }

    public void setiValue(int iValue) {
        this.iValue = iValue;
    }



    public Data() {
        for (int i=0; i<iList.length; i++) {
            aList.add(iList[i]);
        }
        containedClass.setStr("a contained string");
    }

    public Data(Data d) {
        this.iValue = d.iValue;
        this.sValue = d.sValue;
        this.iList = d.iList;
        this.aList = d.aList;
        this.containedClass  = d.containedClass;
    }

    @Override
    public String toString() {
        return "DataPackage.Data{" +
                "iValue=" + iValue +
                ", sValue='" + sValue + "\'" +
                ", iList=" + Arrays.toString(iList) +
                ", aList=" + aList +
                ", containedClass = " + containedClass.getStr() +
                "}";
    }

    public void setsValue(String sValue) {
        this.sValue = sValue;
    }
    public void setiList(int[] iList) {
        int [] iListNew = new int [iList.length];
        for(int i=0;i<iListNew.length;i++){
            iList[i]=iListNew[i];
        }
        this.iList = iListNew;

    }
    public void setaList(ArrayList<Integer> aList) {

        ArrayList<Integer> anew = aList;

        for(int i=0;i<anew.size();i++)
        {
            anew.set(i,aList.get(i));
        }
        this.aList = anew;
    }

    public void setContainedClass(ContainedClass containedClass) {
        ContainedClass c= new ContainedClass();
        this.containedClass=c;
    }
}
