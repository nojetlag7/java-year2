import java.util.Random;
import java.util.Scanner;
public class GradingAgain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int class_size;
        System.out.print("How many students are in the class: ");

        while(true){
            if(input.hasNextInt()){
                class_size = input.nextInt();
                if(class_size <= 0){
                    System.out.println("There must be at least one student in the class.");
                    System.out.print("Try again: ");
                }
                else if(class_size > 30){
                    System.out.println("There must be a max of 30 students in one class.");
                    System.out.print("Try again: ");
                }
                else{
                    break;
                }
            }
            else{
                System.out.println("You must enter an integer value to continue!");
                input.next();
                System.out.print("Try again:");
            }
            
        }
        input.close();

        System.out.println("");

        int[] exam_score = new int[class_size];
        int[] assessment_score = new int[class_size];
        int[] fees_paid = new int[class_size];
        boolean condoned = false;
        final int EXAM_CUTOFF = 25;
        final int ASSESSMENT_CUTOFF = 15;

        //can use manual input or random values, decided to use random(for test purposes)
        for(int i = 0;i < class_size;i++){
            exam_score[i] = rand.nextInt(70);
            assessment_score[i] = rand.nextInt(30);
            if(i % 2 == 0){
                fees_paid[i] = 100;
            }
            else{
                fees_paid[i] = rand.nextInt(40,100);
            }

        }

        for(int i = 0;i < class_size;i++){
            int total_score = assessment_score[i] + exam_score[i];
            System.out.printf("\nStudent number(%d):  Exam score: %d  Assessment Score : %d  Total: %d Fees paid : %d %n", i+1,exam_score[i],assessment_score[i],total_score,fees_paid[i]);

            condoned = (exam_score[i] == EXAM_CUTOFF && assessment_score[i] == 14) || (exam_score[i] == 24 && assessment_score[i] == ASSESSMENT_CUTOFF);
            boolean full_payment = fees_paid[i] == 100;
            boolean passed_exam = exam_score[i] >= EXAM_CUTOFF;
            boolean passed_assessment = assessment_score[i] >= ASSESSMENT_CUTOFF;

        // pass/fail messages
        if (!passed_assessment && !condoned){
            System.out.printf("Student Number %d failed assessment section.\nMust repeat assessment section.\n", i+1);
        }
        else{
            System.out.printf("Student Number %d passed assessment section.\n", i+1);
        }

        if (!passed_exam && !condoned) {
            System.out.printf("Student Number %d failed exam section.\nMust repeat exam section.\n", i+1);
        } else {
            System.out.printf("Student Number %d passed exam section.\n", i+1);
        }

        //giving grades
        if(total_score >= 70){
            System.out.printf("Student Number %d had a grade of A%n",i + 1);
        }
        else if (total_score >= 60){
            System.out.printf("Student Number %d had a grade of B%n",i + 1);
        }
        else if(total_score >= 50){
            System.out.printf("Student Number %d had a grade of C%n",i + 1);
        }
        else if(total_score >= 40){
            System.out.printf("Student Number %d had a grade of D%n",i + 1);
        }
        else{
            System.out.printf("Student Number %d had a grade of F%n",i + 1);
        }

        // certification and fee payment check
        if ((passed_exam && passed_assessment) || condoned){
            if (full_payment) {
                System.out.printf("Certificate has been issued for Student Number %d\n", i+1);
            } else {
                System.out.printf("Student Number %d must pay fees in full to receive certificate.\n", i+1);
            }
        }

        }     
        
        //ALTERNATIVE USING METHODS?
        /*
        System.out.println();
        passed(exam_score, 25, "Exam");
        passed(assessment_score,15,"Assessment");
        passed(fees_paid,100,"fees");
         */

    }

    /*
      static void passed(int[] scores,int cutoff,String test){
        int num = 1;
        boolean fees_paid = true;
        for(int score : scores){
            if(score < cutoff){
                if (test.equals("fees")) {
                    System.out.printf("Student Number(%d) has %s paid fees in full.\n", num, score < cutoff ? "not" : "");
                } 
                else {
                    System.out.printf("Student Number(%d) %s the %s section.\n", num, score < cutoff ? "failed" : "passed", test);
                }
                
            }
            else{
                if(test.equals("fees")){
                    System.out.printf("Student Number(%d) has paid fees in full.\n",num,test);
                }
                else{
                    System.out.printf("Student Number(%d) passed the %s section.\n",num,test);
                }
                
            }
            num++;
        }
        System.out.println("");
    }
     */
   
}


