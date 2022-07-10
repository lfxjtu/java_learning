package fang.java.old;

import org.junit.jupiter.api.Test;

import java.util.Random;

class RandomTest {
    @Test
    public void TestMethod() {
        Random random = new Random();

        int x = random.nextInt();

        double y = random.nextDouble();

        float z = random.nextFloat();

        System.out.printf("Random integer: %d, random double: %f, random float: %f \n", x, y, z);


    }
}