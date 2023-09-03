public class HierarchialInheritance {
    public static void main(String args[]) {
        Mammals human = new Mammals();
        Bird Eagle = new Bird();
        Fish Shark =new Fish();
        human.Walk();
        Eagle.Fly();
        Shark.Swim();
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
    void Walk(){
        System.out.println("Walks");
    }
}
class Fish extends Animals{
    void Swim(){
        System.out.println("Swims");
    }
}
class Bird extends Animals{
    void Fly(){
        System.out.println("Fly");
    }
}