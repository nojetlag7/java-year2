import java.util.Scanner;

public class GradingSys {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Single Scanner instance
 
        int index_num;
        double assessment_score, exam_score, fees_paid; //using double to allow for more realistic range of values
        boolean condoned = false;
 
        //welcome message to improve user experience
        System.out.println("\n\n\n****************WELCOME TO THE KNUST SELF GRADING SYSTEM****************\n\n\n");
 
        // Index number check to make program look more student-specific
        System.out.print("Please input your index number to start the program: ");
        
        //checks to prevent user from inputting garbage values
        while (!input.hasNextInt()) {
            System.out.println("You must enter a valid index number.");
            System.out.print("Try again: ");
            input.next(); // Ignore invalid input
        }

        index_num = input.nextInt();

        while(index_num < 0 || index_num > 10000000){
            System.out.print("You must input a positive number:");
            index_num = input.nextInt();
        }

        System.out.println("\nGenerating report for Student number: " + index_num);
 
         // Getting user scores
        assessment_score = take_assessment(input); // Assume max assessment score is 30
        boolean passed_assessment = assessment_score >= 15;
        exam_score = take_exam(input); // Assume max exam score is 70
        boolean passed_exam = exam_score >= 25;
        fees_paid = take_fees(input); //taken as a percentage
        boolean fees_fully_paid = fees_paid == 100.0;
        
        //checking for the condoned condition
        if ((assessment_score == 15 && exam_score == 24) || (assessment_score == 14 && exam_score == 25)) {
            condoned = true;
        }


        //block of code to inform user if they passed/failed and what they must repeat
        if(!passed_assessment && !condoned){
            System.out.printf("Student Number %d failed assessment section.",index_num);
            System.out.println("\nYou must repeat assessment section");
        }
        else{
            System.out.printf("\nStudent Number %d passed assessment section\n",index_num);
        }

        if(!passed_exam && !condoned){
            System.out.printf("Student Number %d failed exam section.\n",index_num);
            System.out.println("You must repeat exam section");
        }
        else{
            System.out.printf("\nStudent Number %d passed exam section.\n",index_num);
        }
        
        //certificaiton and full fee payment check point
        if((passed_exam && passed_assessment) || condoned){
            if(fees_fully_paid){
                System.out.printf("\nCertificate has been issued for Student Number %d\n",index_num);
            }
            else{
                System.out.printf("\nStudent Number %d must pay fees in full to recieve certificate.\n",index_num);
            }
        } 

        

        
        // Output results (for testing)
        /*
        System.out.println("Assessment Score: " + assessment_score);
        System.out.println("Exam Score: " + exam_score);
        System.out.println("Fees Paid: " + fees_paid);
        System.out.println("Condoned: " + condoned);
         */
        
        input.close();
    }
 
    static double take_assessment(Scanner input) {
        System.out.print("Kindly input assessment score (0-30): ");
         
        while (!input.hasNextDouble()) {
            System.out.println("You must enter a valid number.");
            System.out.print("Try again: ");
            input.next();
        }

        double output = input.nextDouble();
        while (output < 0 || output > 30) {
            System.out.println("You must input a positive number within the range of 0 to 30.");
            System.out.print("Try again: ");
            output = input.nextDouble();
        }
        System.out.println("");
        return output;
    }
 
    static double take_exam(Scanner input) {
        System.out.print("Kindly input exam score (0-70): ");
         
        while (!input.hasNextDouble()) {
            System.out.println("You must enter a valid number.");
            System.out.print("Try again: ");
            input.next();
        }
         
        double output = input.nextDouble();
         
        while (output < 0 || output > 70) {
            System.out.println("You must input a positive number within the range of 0 to 70.");
            System.out.print("Try again: ");
            output = input.nextDouble();
        }
        System.out.println("");
        return output;  
    }
 
    static double take_fees(Scanner input) {
        System.out.print("Kindly enter the fees paid (0-100%): ");
         
        while (!input.hasNextDouble()) {
            System.out.println("You must enter a valid number.");
            System.out.print("Try again: ");
            input.next();
        }

        double output = input.nextDouble();
        while (output < 0 || output > 100) {
            System.out.println("You must input a positive number within the range of 0 to 100.");
            System.out.print("Try again: ");
            output = input.nextDouble();
        }

        System.out.println("");

        return output;
    }
 
}

/*
 import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        int[] exam_scores = [];
        int[] assessment_scores = [];

        new
        }

        scanner.close();
    }
}

 */