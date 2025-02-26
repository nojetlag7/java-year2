public class Inclasstest {
    public static void main(String[] args){
        int[] odd_numbers = new int[5];
        int count = 0;

        for (int i = 0; i < 20; i++) {
            if(i < 10 && i % 2 == 1){
                odd_numbers[count] = i;
                count++;
            }
        }
        for(int i = 4;i >= 0;i--){ 
            System.out.print( odd_numbers[i] + "\t");

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
