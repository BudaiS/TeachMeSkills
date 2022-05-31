package lesson6;

public abstract class Animal {
    int animal_id;
    String name;
    int birthday;

    public Animal(int animal_id, String name, int birthday){
        this.animal_id = animal_id;
        this.name = name;
        this.birthday = birthday;
    }
}
