package fang.java.old;

import java.util.Arrays;
import java.util.List;

public class Immutables {

    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int x : list) {
            sum += x;
        }
        return sum;
    }

    public static int sumAbsolute(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); ++i)
            list.set(i, Math.abs(list.get(i)));
        return sum(list);

    }

    public static void main(String[] args) {
        List<Integer> myData = Arrays.asList(-5, -3, -2);
        System.out.println("Sum of absolute of myData: " + sumAbsolute(myData));
        System.out.println("Sum of myData: " + sum(myData));
    }
}
