package lesson6;

public class Cat extends Animal{
    String eyesColor;

    public Cat(int animal_id, String name, int birthday, String eyesColor){
        super(animal_id, name, birthday);
        this.eyesColor = eyesColor;
    }
}
