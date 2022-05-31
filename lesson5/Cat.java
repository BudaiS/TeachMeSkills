package lesson5;

public class Cat {
    String name;
    int age;
    int feed;

    public  Cat(String name, int age, int feed){
        this.name = name;
        this.age = age;
        this.feed = feed;
    }

    public void showInfoCat(){
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Feed " + feed);
    }

    public void Feeding(){
        if(feed > 5){
            System.out.println("The cat " + name + " eat");
        }else {
            System.out.println("The cat " + name + " didn't eat");
        }
    }

}
