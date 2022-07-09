package fang.java.lessons;

public class Cat {
    private int age;
    private String name;
    public Cat() {
        age = 0;
        name = "John";
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void say() {
        System.out.println("Meow Meow");
    }
}
