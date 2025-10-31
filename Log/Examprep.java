import java.util.*;
public class Examprep {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] student_names = new String[10];
        String[] student_phone_num = new String[10];
        int[] holiday_ratings = new int[10]; //ratings of each student

        int class_size = 0;
        int rating;
        int[] holiday_rating_frequency = new int[8]; //frequency of each possible rating value 


        System.out.println("=== HOLIDAY RATING PROGRAM ===\n");
        while (true) { 
            System.out.printf("Enter Student's %d name: ",class_size+1);
            student_names[class_size] = input.nextLine().trim();
            if(student_names[class_size].equalsIgnoreCase("z" )){
                break;
            }
            else if(student_names[class_size].isBlank()) {
                continue;
            }
            else{
                try {
                    System.out.printf("Enter Student's %d phone number: ",class_size+1);
                    student_phone_num[class_size] = input.nextLine();

                    System.out.printf("Enter Student's %d holiday rating(1-7): ",class_size+1);
                    rating = Integer.parseInt(input.nextLine());
                    if(rating >= 1 && rating <= 7){
                        holiday_ratings[class_size] = rating;
                        holiday_rating_frequency[rating]++;
                    }
                    else{
                        System.out.println("Rating should be between 1 and 7.");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("You must input a valid number.");
                    input.next();
                }
            }
            class_size++;
            if(class_size >= student_names.length){
                System.out.println("Max number of students reached.");
                break;
            }
        }
        
        System.out.printf("\nThe information of %d students were recorded.\n",class_size);
        int[] ratingNums = {1,2,3,4,5,6,7};
        int[] frequencies = new int [7]; //to store frequency of each value

        for (int i = 1; i <= 7; i++) {
            frequencies[i-1] = holiday_rating_frequency[i];
        }
        
        //sorting both arrays
        for (int i = 0; i < frequencies.length - 1; i++) {
            for (int j = i + 1; j < frequencies.length; j++) {
                if (frequencies[j] > frequencies[i]) {
                    // swap frequencies
                    int tempFreq = frequencies[i];
                    frequencies[i] = frequencies[j];
                    frequencies[j] = tempFreq;
        
                    // swap corresponding rating numbers
                    int tempRating = ratingNums[i];
                    ratingNums[i] = ratingNums[j];
                    ratingNums[j] = tempRating;
                }
            }
        }
        
        System.out.println("\nHoliday Destination Ratings (in descending frequency):");

        //ratings frequency output
        for (int i = 0; i < frequencies.length; i++) {
            System.out.printf("Rating %d: %d student(s)\n", ratingNums[i], frequencies[i]);
        }

        //student information lookup
        if(!student_names[0].isBlank()){ //to loop out incase no input was given
            while(true){
                try {
                    System.out.print("Enter a student's name to look for: ");
                    String search = input.nextLine().trim();

                    if(search.equalsIgnoreCase("z")){
                        System.out.println("System shutting down...");
                        break;
                    }
                    else if(contains(student_names,search)){
                        for(int i = 0;i < class_size;i++){
                            if(student_names[i].equalsIgnoreCase(search)){
                                System.out.printf("\n%s's Details:",student_names[i]);
                                System.out.printf("\nPhone number: %s", student_phone_num[i]);
                                System.out.printf("\nStudent's holiday rating: %d\n", holiday_ratings[i]);
                            }
                        }
                    }
                    else{
                        System.out.println("Student was not found in database.");
                        }
                } catch (InputMismatchException e) {
                    System.err.println("Please ensure to give the correct input.");
                    break;
                }
            }
        }
        input.close();
    }

    public static boolean contains(String arr[], String target){
        for(String element : arr){
            if(element != null && element.equalsIgnoreCase(target)){
                return true;
            }
        }
        return false;
    }
}

