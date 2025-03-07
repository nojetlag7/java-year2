public class Quality{
    public static void main(String[] args) {
        /*
         int[] responses = {1,2,5,4,3,5,2,1,3,3,1,4,3,2,5,3,4,5,3,1};
        int[] count = {0,0,0,0,0};

        for(int i = 0; i < responses.length;i++){
            //use switch next time for practice
            if(responses[i] == 1){
            count[0]++;
            }
            else if(responses[i] == 2){
                count[1]++;
            }
            else if(responses[i] == 3){
                count[2]++;
            }
            else if(responses[i] == 4){
                count[3]++;
            }
            else{
                count[4]++;
            }
        }   
        
        for (int i = 0; i < count.length; i++) {
            System.out.printf("Quality rating of %d appeared %d times.\n",i+1,count[i]);
        }
         */
        

        int[] responses = {1,2,5,4,3,5,2,1,3,3,1,4,3,2,5,3,4,5,3,1};
        int[] count = new int[5]; // Default values are already 0

        // // Count occurrences using switch
        // for (int i = 0; i < responses.length; i++) {
        //     switch (responses[i]) {
        //         case 1 -> count[0]++; // -> was introduced in java 12(current version you're using is 17)
        //         case 2 -> count[1]++;
        //         case 3 -> count[2]++;
        //         case 4 -> count[3]++;
        //         case 5 -> count[4]++;
        //     }
        // }

        for(int i = 0;i < responses.length;i++){
            count[responses[i]-1]++;
        }
        /*
         for multiline using the arrow,
         switch(expression){
            case value1 -> {lines of code}
         
            case value2 -> {lines of code}

            default -> {lines of code}
        }
         */
        // Print results
        for (int i = 0; i < count.length; i++) {
            System.out.printf("Quality rating of %d appeared %d times.%n", i + 1, count[i]);
        }
    }
}