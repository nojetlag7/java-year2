
public class Time {
    public static void main(String[] args) {
    
        //initialisng the variables to be used (can make it user input eitherway preferrably)
        int hour = 14,min = 37,second = 28;
        
        //creating a constant to hold the value of total number of seconds in day
        final int SEC_IN_DAY = 24 * 60 * 60;
        
        //finding the total number of minutes and using that to find the total number of seconds
        int sec_since_mid =  (hour * 60 +  min) * 60 + second;
        int sec_rem = SEC_IN_DAY - sec_since_mid;
        
        double percent_sec_passed = (double) sec_since_mid / SEC_IN_DAY;

        //using various inout methods to give output
        System.out.println("The number of second remaining in the day are: " + sec_rem);
        System.out.printf("%d seconds have passed since midnight \n",sec_since_mid);
        System.out.printf("%.2f percent of the day has passed.",percent_sec_passed*100);
    }
}
