import java.util.Scanner;

public class GradingSys {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Single Scanner instance

        int index_num;
        double assessment_score, exam_score, fees_paid;
        boolean condoned = false;

        // Welcome message
        System.out.println("\n\n\n****************WELCOME TO THE KNUST SELF GRADING SYSTEM****************\n\n\n");

        // **Index number validation**
        index_num = (int) getValidInput(input, "Please input your index number to start the program: ", 1, 10000000);

        System.out.println("\nGenerating report for Student number: " + index_num);

        // Getting user scores
        assessment_score = getValidInput(input, "Kindly input assessment score (0-30): ", 0, 30);
        boolean passed_assessment = assessment_score >= 15;
        exam_score = getValidInput(input, "Kindly input exam score (0-70): ", 0, 70);
        boolean passed_exam = exam_score >= 25;
        fees_paid = getValidInput(input, "Kindly enter the fees paid (0-100%): ", 0, 100);
        boolean fees_fully_paid = (fees_paid == 100.0);

        // check for condoned condition
        if ((assessment_score == 15 && exam_score == 24) || (assessment_score == 14 && exam_score == 25)) {
            condoned = true;
        }

        // pass/fail messages
        if (!passed_assessment && !condoned){
            System.out.printf("Student Number %d failed assessment section.\nYou must repeat assessment section.\n", index_num);
        } 
        else{
            System.out.printf("Student Number %d passed assessment section.\n", index_num);
        }

        if (!passed_exam && !condoned) {
            System.out.printf("Student Number %d failed exam section.\nYou must repeat exam section.\n", index_num);
        } else {
            System.out.printf("Student Number %d passed exam section.\n", index_num);
        }

        // certification and fee payment check
        if ((passed_exam && passed_assessment) || condoned){
            if (fees_fully_paid) {
                System.out.printf("\nCertificate has been issued for Student Number %d\n", index_num);
            } else {
                System.out.printf("\nStudent Number %d must pay fees in full to receive certificate.\n", index_num);
            }
        }

        input.close();
    }

    // numeric validation for the inputs
    static double getValidInput(Scanner input, String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (input.hasNextDouble()) {
                value = input.nextDouble();
                if (value >= min && value <= max) {
                    break;
                } else {
                    System.out.printf("Invalid input! Please enter a number between %.2f and %.2f.\n", min, max);
                }
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                input.next(); // Clear buffer
            }
        }
        System.out.println();
        return value;
    }
}
