
import java.util.ArrayList;

//Arraylist
/*an arraylist is a resizeable type of array in which we don't have
to declare the size at instantiation */

//ARRAY V ARRAYLIST
/*
 * arrays are generally faster due to not needing to do dynamic memeory allocation for reszing
 * arrays are more memory efficient due to having a fixed size 
 * arraylists require additional instance methods to work with data in them whereas arrays do not need that
 * arrays allow for elements being placed in a multidimensional format. ArrayLists do not support that
 */
//NB: if you know the number of elements you would be working with, its best to use an array.

//WRAPPER CLASSES FOR ARRAYLISTS
/*
 * Boolean => boolean
 * Character => char
 * Byte => byte
 * Integer => int
 * Double => double
 * Long => long
 * String (already a class and not a primitive data type)
 */

 public class Arrayplay{
    public static void main(String[] args) {
     
    //USING ARRAYS
    /*
      datatype[] arrayname = new datatype[arraysize]
      int[] counts = new int[4];
      
      OR

      int[] a = {1,2,3,4};

     int[] test = {1,2,3,4,5,6,7};
     System.out.println(Arrays.toString(test)); //ouput [1,2,3,...7]

     */
    
    //COPYING ARRAYS
    /*
        There are two ways of copying arrays.
        manually using a for loop and using an array method from the Arrays class

        **manually
        double[] a = new double[10];
        double[] b = new double[a.length]

        for(int i = 0;i<a.length;i++){
            b[i] = a[i];
        }

        **method wise
        double[] c = Arrays.copyOf(a, a.length);

     */

    //SIMPLE METHOD TO FIND A PARTICULAR ARRAY ELEMENT
    /*
      static int search(double[] a,double target){
        for(int i = 0;i < a.length;i++){
            if(a[i] == target)return i;
        }
        return -1;
    }


     */

     //ArrayList example
     // ArrayList<WrapperClass> arraylistname = new ArrayList<>();
     ArrayList<Integer> numbers = new ArrayList<>();

     //WHY <INTEGER> AND NOT <INT>
     /*we used "Integer" and not int because arraylists work with objects and not primitive types
     Integer is the object wrapper class for the primitive type 'int' so when using arraylists for numbers,
     we use Integer instead of int 
     */
     
     numbers.add(1); //using the ArrayList instance method "add" to add data into the arrayList
     numbers.add(2);
     numbers.add(3);

     //Converting an array list into an array
        Integer[] numbers1 = new Integer[numbers.size()]; 
        // notice how we used the wrapper class also when creating the array and not the primitive data type

        numbers1 = numbers.toArray(numbers1);

    System.out.println(numbers.get(2));// outputs 3
    System.out.println(numbers1[2]); //outputs 3

        Teacher somet = new Teacher();
        somet.idNum = 223;
    }

    
}

class Teacher{
    String name;
    private int idNum;
}
class Student{
    String name;
    Teacher teacher;
}