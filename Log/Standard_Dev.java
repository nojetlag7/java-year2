import java.util.Scanner;
public class Standard_Dev{
    public static void main(String[] args){
        
        //declaring and instantiating needed variables
        int sum = 0, num_elems;
        double std = 0.0,mean;

        //getting user input
        System.out.print("Please enter number of elements in set: ");
        Scanner input = new Scanner(System.in);
        num_elems = input.nextInt();
        input.close();

        //creating an array to hold the numbers of the set
        double[] set = new double[num_elems];

        //for loop to continually run to accept user's numbers
        for(int i = 0;i < num_elems;i++){
            System.out.print("Input the next element of the set: ");
            set[i] = input.nextDouble();
            sum += set[i];
            System.out.println("");
        }

        mean = sum/num_elems;

        for(int i = 0;i < num_elems;i++){
            std += Math.pow((set[i] - mean),2);
        } 

        std = Math.sqrt(std/num_elems);

        System.out.printf("The Standard Deviation of the set is: %.4f",std);
    }
}