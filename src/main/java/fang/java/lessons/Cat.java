package fang.java.lessons;

public class Cat {
    private int age;
    private String name;

    public Cat() {
        this(0, "NoName");
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void say() {
        System.out.println(getName() + ": Meow Meow! age: " + getAge());
    }
}
