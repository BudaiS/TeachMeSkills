package lesson6;

public class Tiger extends Cat{
    int countEatenExployees;
    public Tiger(int animal_id, String name, int birthday, String eyesColor, int countEatenExployees){
        super(animal_id, name, birthday, eyesColor);
        this.countEatenExployees = countEatenExployees;
    }
}
