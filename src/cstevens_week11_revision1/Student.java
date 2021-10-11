package cstevens_week11_revision1;

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
    protected double avgAssign;
    protected double avgDiscuss;
    protected double avgMidweek;
    protected ArrayList assignments = new ArrayList<>();
    protected ArrayList discussions = new ArrayList<>();
    protected ArrayList midweeks = new ArrayList<>();

    /**
     * Constructor - call to set values from Main
     */
    public Student() {
    }

    /**
     * Method @setAssign: set assignment grades
     *
     * @param aGrade
     */
    protected void setAssign(double aGrade) {
        assignments.add(aGrade);
    }//End setAssign method

    /**
     * Method @getAssign: calculate assignment average grade
     *
     * @return Assignment average
     */
    public double getAssign() {
        for (int i = 0; i < assignments.size(); i++) {
            System.out.println(assignments.get(i));
        }
        //Assignment average
        double sumA = 0;
        for (int i = 0; i < assignments.size(); i++) {
            sumA = sumA + (double) assignments.get(i);
        }
        avgAssign = (sumA / assignments.size());
        return avgAssign;
    }//End get Assign method

    /**
     * Method @setDiscuss: set discussion grades
     *
     * @param dGrade
     */
    protected void setDiscuss(double dGrade) {
        discussions.add(dGrade);
    }//End setDiscuss method

    /**
     * Method @getDiscuss: calculate discussion average grade
     *
     * @return Discussion average
     */
    public double getDiscuss() {
        for (int i = 0; i < discussions.size(); i++) {
            System.out.println(discussions.get(i));
        }
        //Discussion average
        double sumD = 0;
        for (int i = 0; i < discussions.size(); i++) {
            sumD = sumD + (double) discussions.get(i);
        }
        avgDiscuss = (sumD / discussions.size());
        return avgDiscuss;
    }//End get Discuss method

    /**
     * Method @setMidweek: set midweek assignment grades
     *
     * @param mGrade
     */
    protected void setMidweek(double mGrade) {
        midweeks.add(mGrade);
    }//End setMidweek method

    /**
     * Method @getMidweek: calculate midweek assignment average grade
     *
     * @return Midweek average
     */
    public double getMidweek() {
        for (int i = 0; i < midweeks.size(); i++) {
            System.out.println(midweeks.get(i));
        }
        //Midweek Assignment average
        double sumM = 0;
        for (int i = 0; i < midweeks.size(); i++) {
            sumM = sumM + (double) midweeks.get(i);
        }

        avgMidweek = (sumM / midweeks.size());

        return avgMidweek;
    }//End getMidweek method    

}

