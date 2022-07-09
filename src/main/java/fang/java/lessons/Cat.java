package fang.java.lessons;

public class Cat {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void say() {
        System.out.println(getName() + ": Meow Meow");
    }
}
