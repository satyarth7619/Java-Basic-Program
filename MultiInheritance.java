public class MultiInheritance {
    public static void main(String args[]) {
        Dog Monty= new Dog();
        Monty.breed = "Desi";
        System.out.println(Monty.breed);
        Monty.color= "Mix color";
        System.out.println(Monty.color);
        Monty.legs =4;
        System.out.println(Monty.legs);
        Monty.Nature();
    }
}

class Animals{
    String color;

    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("animals can breathes");
    }
}
class Mammals extends Animals{
    int legs;
    void Nature(){
        System.out.println("Worm blood");
    }
}
class Dog extends Mammals{
    String breed;

}
