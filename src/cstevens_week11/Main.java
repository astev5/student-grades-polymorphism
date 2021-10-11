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

//Begin Class Main
public class Main {

    //Begin Main Method
    public static void main(String[] args) {

        //Declarations
        String again;
        String firstName;
        String lastName;
        int studentType;
        String ideaSurvey;
        double finThesis;

        //FIX THIS BEFORE SUBMITTING
        double finalAvg;

        //Create an object of the scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("\nWelcome to the Student Grade Calculator\n");

        //Begin DO WHILE loop to re-run the program
        do {

            //Accept user input for number of first & last name
            System.out.print("\nEnter Student's First Name: ");
            firstName = sc.nextLine();
            System.out.print("Enter Student's Last Name: ");
            lastName = sc.nextLine();

            //Begin DO WHILE loop to re-run switch case if invalid selection
            boolean tryAgain = false;
            boolean exitLoop = false;

            do {
                //Request student type selection
                System.out.printf("\nSelect %s %s's student type:",
                        firstName, lastName);
                System.out.print("\n1. Under Graduate Student\n"
                        + "2. Graduate Student\n->: ");
                studentType = sc.nextInt();
                sc.nextLine();

                //Begin switch case for student type
                switch (studentType) {

                    case 1:
                        //Create new undegrad object
                        UnderGrad ungrad = new UnderGrad();
                        finalAvg = ungrad.getFinalGrade();
                        
                        System.out.printf("\nDid %s %s fill out the IDEA "
                                + "Survey? (Y for Yes, N for No): ",
                                firstName, lastName);
                        ideaSurvey = sc.nextLine();

                        if (ideaSurvey.equalsIgnoreCase("Y")) {
                            System.out.printf("\n%s %s's final grade average "
                                    + "is: %.2f",
                                    firstName, lastName, finalAvg + 1);
                        } else {
                            System.out.printf("\n%s %s's final grade average "
                                    + "is: %.2f",
                                    firstName, lastName, finalAvg);
                        }
                        break;

                    case 2:
                        //Create new grad object
                        Grad grad = new Grad();
                        System.out.printf("\nEnter the Final Thesis grade for "
                                + "%s %s: ", firstName, lastName);
                        finThesis = sc.nextDouble();
                        sc.nextLine();
                        
                        grad.setFinalGrade(finThesis);
                        finalAvg = grad.getFinalGrade();

                        System.out.printf("\nDid %s %s fill out the IDEA Survey?"
                                + " (Y for Yes, N for No): ",
                                firstName, lastName);
                        ideaSurvey = sc.nextLine();

                        if (ideaSurvey.equalsIgnoreCase("Y")) {
                            System.out.printf("\n%s %s's final grade average "
                                    + "is: %.2f",
                                    firstName, lastName, finalAvg + 1);
                        } else {
                            System.out.printf("\n%s %s's final grade average "
                                    + "is: %.2f",
                                    firstName, lastName, finalAvg);
                        }
                        break;

                    default:
                        System.out.print("\nInvalid selection. "
                                + "Please try again.");
                        tryAgain = true;

                }
                if(exitLoop)
                    break;
                
            } while (tryAgain);

            // request input to continue program
            System.out.print("\n\nWould you like to run another calculation? "
                    + "(Y for Yes, N for No): ");
            again = sc.nextLine();

        } while (again.equalsIgnoreCase("Y"));

        System.out.print("\nThank you for using the Student Calculator. "
                + "Goodbye.\n\n");
    }
} //End Main Method
