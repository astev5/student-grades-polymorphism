package cstevens_week11_revision1;

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

    protected double weightA;
    protected double weightD;
    protected double weightM;
    protected double finGrade;
    protected double weightGrade;
    
    /**
     * Constructor
     */
    public UnderGrad() {
    }

    protected void setWeightGrade(double avgAssign, double avgDiscuss, 
            double avgMidweek){

        Student st = new Student();

        weightA = avgAssign * PERCENT_A;
        weightD = avgDiscuss * PERCENT_D;
        weightM = avgMidweek * PERCENT_M;
        
        weightGrade = weightA + weightD + weightM;
    }
    
    public double getWeightGrade(){
        return weightGrade;
    }
}
    
    
    
 