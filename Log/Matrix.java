public class Matrix {
    public static void main(String[] args) {
        System.out.println("Welcome to the 3*3 matrix solver\n");

        int[][] matrix_odd = {
            {1,3,5,},
            {7,9,11},
            {13,15,17}
        };
        int[][] matrix_even = {
            {2,4,6},
            {8,10,12},
            {14,16,18}
        };
        
        int product_odd=1,product_even= 1,lagging_even=1,lagging_odd=1;

        for(int i = 0;i < 3;i++){
                product_even *= matrix_even[i][i];
                product_odd *= matrix_odd[i][i];
                lagging_even *= matrix_even[i][2-i];
                lagging_odd *= matrix_odd[i][2-i];
        }

        int diff_even = Math.abs(product_even-lagging_even);
        int diff_odd = Math.abs(product_odd - lagging_odd);
        int diff_trail = Math.abs(lagging_even - lagging_odd);


        System.out.printf("The product of leading diagonal elememts for even matrix is: %d",product_even);
        System.out.printf("\nThe product of leading diagonal elememts for odd matrix is: %d",product_odd);
        System.out.printf("\nThe difference between the product of the leading and lagging diagonals for the even matrix is: %d",diff_even);
        System.out.printf("\nThe difference between the product of the leading and lagging diagonals for the odd matrix is: %d",diff_odd);
        System.out.printf("%nThe difference between the products of the traling diagonals is: %d",diff_trail);
    }
}
