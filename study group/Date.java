
public class Date {
    public static void main(String[] args){

        // Animal cheetah = new Animal();
        // System.out.println("Number of lives:" + cheetah.lives);
        // System.out.println(cheetah.locomotion);

    //     Cars car1 = new Cars("Toyota", "Red");
    //     Cars car2 = new Cars();
    //    System.out.println("My car is a " + car1.brand + " and is colored " + car1.color);
    //     //System.out.println("My car has this number of tyres: " + car1.tyres);

    //     System.out.println("\nMy car is a " + car2.brand + " and is colored " + car2.color);
    //     //System.out.println("My car has this number of tyres: " + car2.tyres);

        Dog dog1 = new Dog("German Shepherd", "golden");
        Dog dog2 = new Dog();

      
        dog1.shout();
        dog2.shout();
        dog1.info();
        dog2.info();
        
        // Date1 birthday = new Date1(30,8,2005);
        // Date1 defaultx = new Date1();
        // System.out.println("The defualt date is " + defaultx.output());
        // System.out.println("Your birthday is " + birthday.output());

        String[] names = {"Hello","Bass","COke"};
        int[] marks = {1,2,3};

        for(int i= 0; i < names.length;i++){
            System.out.println((i+1) + "." + names[i] + "\t\t\t" + marks[i]);
        }
        
    }

}


class Animal{
    boolean locomotion = true;
    boolean grows = true;
    int lives = 1;

    public Animal(){

    }
}

class Cars{
    boolean has_engine = true;
    int doors =4;
    int tyres = 4;
    String brand;
    String color;


    public Cars(String brand,String color){
        this.brand = brand;
        this.color = color;
    };

    public Cars(){
        this.brand = "Not known";
        this.color = "Plain";
    }
}

class Dog{
    int legs = 4;
    String breed;
    String color;

    public Dog(String breed,String color){
        this.breed = breed;
        this.color = color;
    }

    public Dog(){
        this.breed = "Not known";
        this.color = "Brown";
    }

    public void shout(){
        System.out.println(this.breed + " is barking");
    }

    public void info(){
        System.out.println("This dog is a " + this.breed + ".It is colored " + this.color);
    }

    public static void run(){
        System.out.println("This dog can runnnn");
    }
}

class Date1{
    final private int year;
    final private int month;
    final private int day;

    Date1(){
        this.year = 2000;
        this.month = 1;
        this.day = 1;
    };

    Date1(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String output(){
        return (this.day + "/" +this.month+ "/" + this.year);
    }
}