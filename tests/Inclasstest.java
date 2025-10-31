import java.util.InputMismatchException;
import java.util.Scanner;
public class Inclasstest {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        try {
            int age = Integer.parseInt(input.nextLine());
            System.out.print("Enter you salary:");
            double salary = input.nextDouble();
            
            if(age < 0 || salary < 0){
                throw new InputMismatchException(); 
            }
            else if(age < 18){
                System.out.println("You are too young to enter the bar.");
            }
            else{
                System.out.println("Welcome to the bar!");
                System.out.println("Your salary is " + salary);
            }
            
        } 
        catch (NumberFormatException e) {
            System.out.println("You must enter a valid number.");
        }
        catch(InputMismatchException e){
            System.out.println("Your salary must be in the form of a double.");
        }
        

        // int[] a = {3,5,1,2,4};
        // int i,j,temp;
        // for(i = 4;i >= 0; i--){
        //     for(j = 0;j < i;j++){
        //         if(a[j] > a[j+1]){
        //             temp = a[j];
        //             a[j] = a[j+1];
        //             System.out.println(a[j+1] = temp);
        //         }
        //     }
        // }
        
    }
}
