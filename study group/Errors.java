public class Errors{
    public static void main(String[] args){
        /*
         The try statement allows you to define 
         a block of code to be tested for errors while
            it is being executed.

        the 'catch' statement allows you to define a block of code to be
        executed, if an error occurs in the try block

        try{
        
        }
        catch(Exception e){}
         */
    
        
         //first example
        /* 
                 int numbers[] = {1,2,3};
        try {
            System.err.println(numbers[10]);
        } catch(Exception e){
            System.out.println("Something went wrong.");
        }finally{
           System.out.println("The 'try catch' is finished."); 
        }
       
        */

        //the throw keyword
        /*
         allows you to create a custom error and it is used together with an
         exception type. Examples of exception types are ArithmeticException,
         FileNotFoundexception, ArrayINdexOutOfBoundsException,etc
         */

         //java also has lamda expressions apprarently

         //INTERFACES

         /*
          work like abstract classes and are used to create a 
          grouping of related abstract methods

          classescan call these interfaces using the key word
          'implements' instead of 'extends'
          */   
          Pig oinker = new Pig();
          oinker.animalSound();
          oinker.sleep();
          System.out.println(oinker.testname);
    }
}

// Interface
    interface Animal {
        public void animalSound(); // interface method (does not have a body)
        public void sleep(); // interface method (does not have a body)
    }

    interface Mammal{
        public void fourleggedrun();
    }
    
    // Pig "implements" the Animal interface
    class Pig extends Test implements Animal,Mammal{

        @Override
        public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
        }

        @Override
        public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
        }

        @Override
        public void fourleggedrun(){System.out.println("Mammal runs with four legs");}
    }
    abstract class Test{
        int testname = 8;
    }
