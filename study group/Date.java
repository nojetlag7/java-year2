
public class Date {
    public static void main(String[] args){
        int date = 28, year = 2025;
        String day = "Tuesday",month = "January";
        
        //american
        //System.out.println("American format:");

        System.out.printf("American format:\n%s%s%d%d\n",day,month,date,year);

        //European
        System.out.println("\nEuropean format:");
        System.out.printf("%s %dth %s, %d.",day,date,month,year);

    }

}
