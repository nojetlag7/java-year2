public class Arraylab{
    public static void main(String[] args) {
        int[][] hstreet = {
            {4200,4800,5000},
            {5200,5800,6000},
            {4600,4900,5800},
            {4600,4900,5000}
        }; 
        int[][] mall= {
            {5700,6300,6000},
            {7000,6700,7300},
            {6500,6600,6200},
            {7200,6900,7500}
        };

        int[] combined_monthly_sales = new int[12];
        int[] combined_quarterly_sales = new int[4];
        int combined_yearly_sales;
        int counter = 0;

        for(int i = 0;i < hstreet.length;i++){
            for(int j = 0; j < hstreet[i].length;j++){
                combined_monthly_sales[counter] = hstreet[i][j] + mall[i][j];
                counter++;
            }
        }

    }
}