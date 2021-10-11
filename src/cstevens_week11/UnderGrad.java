package cstevens_week11;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 11 Assignment
 * @Date: July 30, 2021
 * @Description: Student Grade Calculator Using Polymorphism
 */

//Begin UnderGrad Class
public class UnderGrad extends Student {

    //Declarations
    private final double PERCENT_A = 0.65;
    private final double PERCENT_D = 0.25;
    private final double PERCENT_M = 0.10;

    private double weightA;
    private double weightD;
    private double weightM;
    private double finGrade;

    /**
     * Constructor
     */
    public UnderGrad() {
        setFinalGrade();
    }

    /**
     * Method @setFinalGrade: calculate final grade for undergrad student
     */
    private void setFinalGrade() {
        weightA = super.getAssign() * PERCENT_A;
        weightD = super.getDiscuss() * PERCENT_D;
        weightM = super.getMidweek() * PERCENT_M;

        finGrade = (weightA + weightD + weightM);
    }

    /**
     * Method @getFinalGrade
     * @return final grad for undergrad student
     */
    public double getFinalGrade() {
        return finGrade;
    }

}
