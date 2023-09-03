public class inheritance {
    public static void main(String args[]) {
        fish Shark = new fish();
        Shark.eat();
        Shark.breathe();
        Shark.swim();
    }
}
// Base class

class Animals{
    String color;

    void eat(){
        System.out.println("EATS");

    }

    void breathe(){
        System.out.println("Breathes");
    }

}

// Derived class

class fish extends Animals{
    int fins;
    void swim(){
        System.out.println("Swims in Water");
    }
}
