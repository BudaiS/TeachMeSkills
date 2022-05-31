package lesson6;

public class Dog extends Animal{
    double weight;
    public Dog(int animal_id, String name, int birthday, double weight){
        super(animal_id, name, birthday);
        this.weight = weight;
    }
}
