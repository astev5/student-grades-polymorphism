package cstevens_week11;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 11 Assignment
 * @Date: July 30, 2021
 * @Description: Student Grade Calculator Using Polymorphism
 */
//Begin Grad Class
public class Grad extends Student {

    //Declarations
    private final double PERCENT_A = 0.40;
    private final double PERCENT_D = 0.15;
    private final double PERCENT_M = 0.15;
    private final double PERCENT_FT = 0.30;

    private double weightA;
    private double weightD;
    private double weightM;
    private double weightF;
    private double finGrade;

    /**
     * Constructor
     */
    public Grad() {
    }

    /**
     * Method @setFinalGrade: calculate final grade for grad student
     * @param f 
     */
    protected void setFinalGrade(double f) {
        weightA = super.getAssign() * PERCENT_A;
        weightD = super.getDiscuss() * PERCENT_D;
        weightM = super.getMidweek() * PERCENT_M;
        weightF = f * PERCENT_FT;

        finGrade = (weightA + weightD + weightM + weightF);
    }//End setFinalGrade method

    /**
     * Method @getFinalGrade
     * @return final grade for grad student
     */
    public double getFinalGrade() {
        return finGrade;
    }

}
