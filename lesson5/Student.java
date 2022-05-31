package lesson5;

public class Student {
    String name;
    int numberGroup;
    int mark;

    public void showInfo()  {
        System.out.println("Name - " + name);
        System.out.println("Group - " + numberGroup);
        System.out.println("Mark - " + mark);
    }

    public Student(String name, int numberGroup, int mark) {
        this.name = name;
        this.numberGroup = numberGroup;
        this.mark = mark;
    }
    public void showMark(){
        if(mark > 8){
            System.out.println("Excellent student " + name);
        }

    }
}
