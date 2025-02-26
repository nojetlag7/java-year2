
public class IOpractice {
    public static void main(String[] args) {


        int[] scores = {13,15,11,9,13,23,14,7,89,2,45,67};
        // for (int score : scores) {
        //     System.out.println("Student who scored " + score + " got " + score*5 + "%.");
        // }

        int output = indexOfMax(scores);
        System.out.println("\nThe largest element in the array is at index: " + output);
    }

    static int indexOfMax(int[] array){
        int largest = array[0];
        int postion = 0;
        for(int i = 0;i < array.length;i++){
            if(largest < array[i]){
                largest = array[i];
                postion = i;
            }
        }
        return postion;
    }
}


