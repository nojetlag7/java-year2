import java.util.Scanner;
public class Midsem{
    public static void main(String[] args) {
        //System.out.println("Welcome to the Grading system");

        Scanner input = new Scanner(System.in);
        System.out.print("How many students are in the class: ");
        int class_size = input.nextInt();

        double[] exam_scores = new double[class_size];
        double[] assessment_scores = new double[class_size];
        int[] index_numbers = new int[class_size];
        double[] total_scores = new double[class_size];

        for(int i = 0;i<class_size;i++){
            System.out.printf("\nEnter student number %d index number: ",i+1);
            index_numbers[i] = input.nextInt();

            System.out.printf("\nEnter student number %d assessment score: ",i+1);
            assessment_scores[i] = Math.round(( (double) input.nextInt() / 100) * 30);
            
            System.out.printf("\nEnter student number %d exam score: ",i+1);
            exam_scores[i] = Math.round(((double) input.nextInt() / 100) * 70);

            total_scores[i] = assessment_scores[i] + exam_scores[i];
        }
        input.close();

        for(int i = 0;i<class_size;i++){
            System.out.printf("Student %d had a total score of: %f %n",index_numbers[i],total_scores[i]);
        }
    }
}