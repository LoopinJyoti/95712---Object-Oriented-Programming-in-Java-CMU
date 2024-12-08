// NAME : JYOTI KHANCHANDANI
// ANDREW ID: jkhancha
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.io.FileNotFoundException;

public class Lab6Main {

    //myfile =null;
    File myfile;
    //Scanner fileScanner = null;
    Scanner fileScanner = new Scanner(System.in);
    ArrayList<YearPop> arrData = new ArrayList<>();
    boolean test;

    public static void main(String[] args) {
        File myfile = null;
        //Scanner fileScanner = null;
        Scanner fileScanner = new Scanner(System.in);
        System.out.println("enter the year to find: ");
        int y = fileScanner.nextInt();

        Lab6Main lm = new Lab6Main();
        //Checking Existence of file
        lm.openFile("C:\\Users\\jyoti\\IdeaProjects\\Lab6Main\\paPop.csv");
        System.out.println(lm.myfile.exists());

        lm.createList();
        if (lm.findYear(y) == -1.0) {
            System.out.println("Year not found in list");
        } else
            System.out.println(lm.findYear(y));


        System.out.println("Computing Fibonacci Series here:");
        System.out.println("Enter the number for length of fibo");
        int m=fileScanner.nextInt();
        int f = computeFibonacci(0, 1, m+1);
        System.out.println("Fibonacci #"+m+" = "+f);
    }



    public boolean openFile(String filename) {
        //System.out.println("hr");

//        try {
            myfile = new File(filename);
//            Scanner fileScanner = new Scanner(myfile);

//        } catch (IOException e) {
//            System.out.println("ERROR!! Cannot read line any more " + e.getMessage());
//            return false;
//        }
        return myfile.isFile();
    }

    public YearPop makeData(String line) {
// "2023,56.6678"

        //Create new YearPop object
        YearPop y = new YearPop();
        //Split the string by ,
        String[] arrOfStr = line.split(",");

        y = new YearPop( Integer.parseInt(arrOfStr[0]), Double.parseDouble(arrOfStr[1]));
        return y;
    }


    void createList() {
        try {
            File myObj = myfile;
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                //Splitting
                arrData.add(makeData(data));
//                System.out.println(arrData.get(arrData.size()-1).getDensity());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }


        double findYear(int year) {
            for (int i = 0; i < arrData.size(); i++) {


                if (year == arrData.get(i).getYear()) {
                    return arrData.get(i).getDensity();
                } else {
                    System.out.println();
                    return -1.0;
                }
            }
            return -1.0;
        }
//FIBONACCI SERIES


          public static int computeFibonacci(int first,int second,int n){
               if (n == 0) {
                   return 0;
               }
               if(n ==1){
                   return 1;
               }
               if(n==2) {
                   return (first + second);
               }
               else {
                   //System.out.println("Recursing with first:" + first + "and second: ");
                   return computeFibonacci(second, (first + second), n - 1);
               }

          }

        }


