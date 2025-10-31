public class Superclass {
    public static void main(String[] args) {
        Animal first = new Animal("Donkey");
        Mammal second =  new Mammal();

        second.name = "Pig";
        
        first.make_noise(); //Donkey is making noise
        second.make_noise(); //this mammal is making noise
        
}
}
class Animal{
    public boolean brain = true;
    public String name;

    public Animal(String name){
        this.name = name;
    }
    public Animal(){
        this.name = "unknown";
    }

    public void make_noise(){
        System.out.println(this.name + " is making noise");
    }


}
class Mammal extends Animal{

    private boolean mammary_glands = true;
    private int legs = 4;

    @Override
    public void make_noise(){
        System.out.println("This mammal is making noise");
    }

    public void run(){
        System.out.println("This mammal is running");
    }


}
