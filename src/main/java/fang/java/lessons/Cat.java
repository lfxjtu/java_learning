package fang.java.lessons;

public class Cat extends Animal {
    private int age;
    private String name;

    private String preferenceFood;

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

    public String getPreferenceFood() {
        return preferenceFood;
    }

    public void setPreferenceFood(String preferenceFood) {
        this.preferenceFood = preferenceFood;
    }

    @Override
    public void eat() {
        System.out.println("Nom Nom Nom");
    }

    /**
     *
     */
    @Override
    public void makeNoise() {
        System.out.println("Meow Meow");
    }
}
