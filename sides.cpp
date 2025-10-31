//LOGBOOK EX1 STANDARD DEVIATION(GROUP1)
/*
#include <iostream>
#include <cmath>

using namespace std;

int main(){

    int sum,num_elems = 0;
    double std,mean = 0.0;

    cout << "Enter number of elements in set to find standard devaition of: ";
    cin >> num_elems;

    if (num_elems <= 0){
        cout << "There must be at least 1 element in the set.\n";
        return 1;
    }

    double set[num_elems];

    for(int i = 0;i < num_elems;i++){
        cout << "Input the next element of the set: ";
        cin >>  set[i];
        sum += set[i];
        cout << endl;
    }

    mean = sum/num_elems;
    
    for(int i= 0;i< num_elems;i++){
        std += pow((set[i] - mean),2);
    }

    cout << "The Standard Deviation of the set is " << sqrt(std/num_elems); 
    return 0;
}
*/

//LOGBOOK EX2 FACTORIAL(GROUP 2)
/*
#include <iostream>
using namespace std;

int fact(int num);
int main(){

    int num;

    cout << "Enter number to find factorial of: ";
    cin >> num;
    string datatype = typeid(num).name();
    if(datatype != "i"){
        cout << "Number inputted must be a whole number.";
        return 1;
    }
    else if(num < 0){
        cout << "Number inputted must be greater than zero.";
        return 1;
    }
    else{
        cout << "\nThe factorial of " << num << " is "<< fact(num);
    }


    return 0;
}

int fact(int num){
    if(num == 0 || num == 1){
        return 1;
    }
    else{
        return num * fact(num -1);
    }
}
*/

#include <iostream>
#include <cmath>
#include <iomanip>

using namespace std;

int main(){

    const double MAX_WITHDRAWAL = 500.0;
    const double SERVICE_CHARGE = 0.04;
    bool running = true;
    double balance = 0.0;
    double withdrawn_amount = 0.0;

    cout << "*************************************************\n";
    cout << "WELCOME TO THE MOBILE BANKING APP\n";
    cout << "*************************************************\n\n\n";
    while(running){
        
        cout << "Kindly select an option to continue\n1.Deposit\n2.Make Withdrawal\n3.Close Application\nChoice:";
        int option;
        cin >> option;

        switch(option){
            case 1:
                cout << "How much are you deposting? Enter amount:";
                //can decide to add try except block later
                double deposit_amount;
                cin >> deposit_amount;
                while(deposit_amount <= 0){
                    cout << "Deposit amount cannot be less than 0.";
                    cout << "Enter a valid amount:";
                    cin >> deposit_amount;
                }
                balance += deposit_amount;
                cout << "Your new balance is: " << fixed << setprecision(2) << balance << endl;
                // fixed and setprecion to ensure output is in 2 decimal places
                break;
            case 2:
                if(balance <= 0){
                    cout << "INUFFICIENT FUNDS TO WITHDRAW. DEPOSIT FIRST\n\n";
                }
                else{
                    cout << "How much are you withdrawing? Enter amount:";
                    double withdrawal_amount;
                    cin >> withdrawal_amount;
                    if(withdrawal_amount > MAX_WITHDRAWAL){
                        cout << "Withdrawal amount cannot be greater than " << MAX_WITHDRAWAL << endl;
                    }
                    else if(withdrawal_amount + (withdrawal_amount > 300 ? (withdrawal_amount - 300) * SERVICE_CHARGE : 0) > balance){
                        cout << "Insufficient funds for this transaction including service charges." << endl;
                        cout << "Would you like to proceed anyway with a $25 service charge? (1.Yes  2.No): ";
                        int choice;
                        cin >> choice;
                        if(choice == 1){
                            if(balance >= withdrawal_amount + 25){
                                balance -= (withdrawal_amount + 25);
                                cout << "You have withdrawn " << withdrawal_amount << " with a $25 charge." << endl;
                                cout << "New balance: " << balance << endl;
                                withdrawn_amount += withdrawal_amount;
                            } else {
                                cout << "Still insufficient funds to proceed with $25 charge. Transaction cancelled." << endl;
                            }
                        } else {
                            cout << "Transaction cancelled." << endl;
                        }
                    }

                    else if(withdrawn_amount > MAX_WITHDRAWAL || withdrawn_amount + withdrawal_amount > MAX_WITHDRAWAL){
                        cout << "You have reached your maximum withdrawal limit of 500." << endl;
                    }
                    else if(withdrawal_amount <= 0){
                        cout << "Withdrawal amount cannot be less than or equal to 0." << endl;
                    }
                    else if(withdrawal_amount <= 300){
                        balance -= withdrawal_amount;
                        cout << "You have successfully withdrawn " <<  fixed << setprecision(2) << withdrawal_amount << endl;
                        cout << "Your new balance is: " << fixed << setprecision(2) << balance << endl;
                        withdrawn_amount += withdrawal_amount;
                    }
                    else{
                        balance -= ((withdrawal_amount-300) * SERVICE_CHARGE + withdrawal_amount);
                        cout << "You have successfully withdrawn " <<  fixed << setprecision(2) << withdrawal_amount << endl;
                        cout << "A service charge of " << fixed << setprecision(2) << SERVICE_CHARGE * withdrawal_amount << " has been deducted from your account." << endl;
                        cout << "Your new balance is: " << fixed <<setprecision(2) << balance << endl;
                        withdrawn_amount += withdrawal_amount;
                    }
                }
                break;
            case 3:
                cout << "Closing application...";
                running = false;
                break;
            default:
                cout << "Invalid option selected. Please try again.\n";
                break;
        }
    }


    return 0;
}