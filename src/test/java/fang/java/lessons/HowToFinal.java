package fang.java.lessons;

public class HowToFinal {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        final Cat myCat;
        myCat = new Cat();
        myCat.eat();
        System.out.println(PI * 3);
    }
}
