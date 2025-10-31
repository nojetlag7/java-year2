import java.util.Scanner;
public class banking {
    public static void main(String[] args) {
        boolean running = true;
        Scanner input = new Scanner(System.in);

        while (running) {
            System.out.println("\nWelcome to the Banking App");
            System.out.println("1. Create Account");
            System.out.println("2. Show Account Info");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");
    
            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            input.nextLine(); // clear buffer
    
            switch(choice){
                case 1:
                    // Logic to create account and assign to `account`
                    break;
                case 2:
                    // if account != null → show_info(account)
                    break;
                case 3:
                    // deposit logic
                    break;
                case 4:
                    // withdraw logic
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    
        input.close();
    }  
    //class variables
    String account_name;
    String account_number;
    double account_balance = 0.0;
    int age = 18;

    //create account method
    public static void create_account(Scanner input){
        System.out.println("Creating account....Kindly enter appropriate information.");
        try {
            System.out.print("Kindly enter your full name:" );
            String name = input.next();
            System.out.print("Kindly enter your age:" );
            int age = 0;
            while(age < 18){
                age = input.nextInt();
                if(age < 18){
                    System.out.println("Age must be greater than or equal to 18 to make an account\n"); 
                    input.next(); //clearing input
                }

                banking test = new banking(name, age);
            }
        } 
        catch(Exception e){
            System.err.println("\n" + e);
            System.out.println("Incorrect input detected.");
        }
        finally {
            System.out.println("Program terminated. Closing app...");
        }
    }

    //constructor
    public banking(String account_name,int age){
        this.account_name = account_name;
        this.account_number = Integer.toString((int) (Math.random() * 12345678));
        this.age = age;
    }
    public double get_balance(){
        return this.account_balance;
    }
    public void set_balance(double balance){
        this.account_balance = balance;
    }

    public static void show_info(banking object){
        System.out.println("Showing account info for Account number " + object.account_number + ":\n\n\n");
        System.out.printf("Account holder name: %s", object.account_name);
    }

    public int getAge() {
        return age;
    }

}
