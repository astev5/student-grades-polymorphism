package cstevens_week11;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 11 Assignment
 * @Date: July 30, 2021
 * @Description: Student Grade Calculator Using Polymorphism
 */
//Imports
import java.util.*;

//Begin Class Student
public class Student {

    //Declarations
    private int numAssign;
    protected double avgAssign;
    private int numDiscuss;
    protected double avgDiscuss;
    private int numMidweek;
    protected double avgMidweek;

    /**
     * Constructor
     */
    public Student() {
        setAssign();
    }

    //Create an object of the scanner
    Scanner sc = new Scanner(System.in);

    /**
     * Method @setAssign: set assignment grades & calculate average
     */
    private void setAssign() {

        //Request number of assignments
        System.out.print("\nEnter the number of Assignment grades: ");
        numAssign = sc.nextInt();

        //Create array list for assignment grades
        ArrayList<Double> assignments = new ArrayList<>();

        for (int i = 0; i < numAssign; i++) {
            System.out.printf("Enter Assignment grade number %d: ", i + 1);
            assignments.add(sc.nextDouble());
            sc.nextLine();
        }

        //Assignment average
        double sumA = 0;
        for (double a : assignments) {
            sumA += a;
        }
        avgAssign = (sumA / assignments.size());

        setDiscuss();
    }//End setAssign method

    /**
     * Method @getAssign
     *
     * @return Assignment average
     */
    public double getAssign() {
        return avgAssign;
    }//End get Assign method

    /**
     * Method @setDiscuss: set discussion grades & calculate average
     */
    private void setDiscuss() {

        //Request number of discussions
        System.out.print("\nEnter the number of Discussion grades: ");
        numDiscuss = sc.nextInt();

        //Create array list for discussion grades
        ArrayList<Double> discussions = new ArrayList<>();

        for (int i = 0; i < numDiscuss; i++) {
            System.out.printf("Enter Discussion grade number %d: ", i + 1);
            discussions.add(sc.nextDouble());
            sc.nextLine();
        }

        //Discussion average
        double sumD = 0;
        for (double d : discussions) {
            sumD += d;
        }
        avgDiscuss = (sumD / discussions.size());

        setMidweek();
    }//End setDiscuss method

    /**
     * Method @getDiscuss
     *
     * @return Discussion average
     */
    public double getDiscuss() {
        return avgDiscuss;
    }//End getDiscuss method

    /**
     * Method @setMidweek: set midweek assignment grades & calculate average
     */
    private void setMidweek() {

        //Request number of midweek assignments
        System.out.print("\nEnter the number of Midweek Assignment grades: ");
        numMidweek = sc.nextInt();

        //Create array list for midweek assignment grades
        ArrayList<Double> midweeks = new ArrayList<>();

        for (int i = 0; i < numMidweek; i++) {
            System.out.printf("Enter Midweek Assignment grade number %d: ", 
                    i + 1);
            midweeks.add(sc.nextDouble());
            sc.nextLine();
        }

        //Midweek Assignment average
        double sumM = 0;
        for (double m : midweeks) {
            sumM += m;
        }
        avgMidweek = (sumM / midweeks.size());
    }//End setMidweek method

    /**
     * Method @getMidweek
     *
     * @return Midweek Assignments average
     */
    public double getMidweek() {
        return avgMidweek;
    }//End getMidweek method

}
