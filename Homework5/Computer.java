package Homework5;

public class Computer {
    String processor;
    String ram;
    String hdd;
    int resource;

    public Computer(String processor, String ram, String hdd, int resource){
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
    }
    public void showInfo(){
        System.out.println("Processor " + processor);
        System.out.println("RAM " + ram);
        System.out.println("HDD " + hdd);
        System.out.println("Resource " + resource);
    }


}
