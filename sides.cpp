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