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
        boolean[] greater_month = new boolean[12];
        int[] combined_quarterly_sales = new int[4];
        int combined_yearly_sales = 0,yearly_hstreet=0,yearly_mall=0;
        int month_index = 0;

        for(int i = 0;i < hstreet.length;i++){
            for(int j = 0; j < hstreet[i].length;j++){
                combined_monthly_sales[month_index] = hstreet[i][j] + mall[i][j];
                yearly_hstreet += hstreet[i][j];
                yearly_mall += mall[i][j];
                greater_month[month_index] = hstreet[i][j] > mall[i][j]; //boolean array to decide which branch did better monthly
                month_index++;
            }
        }
        
        for(int i = 0;i< 4;i++){//4 quarters
            int sum = 0;
            for(int j = 0;j < 3;j++){//3 months per quarter
                sum += combined_monthly_sales[i * 3 + j];
            }
            combined_quarterly_sales[i] = sum;
            combined_yearly_sales += sum;
        }
    
        System.out.println("Monthly Combined Sales:\n");
        for (int i = 0; i < combined_monthly_sales.length; i++) {
            System.out.println("Month " + (i + 1) + ": $" + combined_monthly_sales[i]);
            System.out.println(greater_month[i] ? "Hstreet Branch did better in this month.\n" : "Mall branch did better in this month.\n");
        }

        System.out.println("\nQuarterly Combined Sales:");
        for (int i = 0; i < combined_quarterly_sales.length; i++) {
            System.out.println("Quarter " + (i + 1) + ": $" + combined_quarterly_sales[i]);
        }

        System.out.println("\nYearly Combined Sales: $" + combined_yearly_sales);

        //ranking the shops
        System.out.println(yearly_hstreet > yearly_mall ? "Hstreet Branch performed better in the year." : "Mall Branch performed better in the year.");
       

        
    }
}