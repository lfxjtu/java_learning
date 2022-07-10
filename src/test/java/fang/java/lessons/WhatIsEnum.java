package fang.java.lessons;

public class WhatIsEnum {
    public static void main(String[] args) {
        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
            System.out.println(day.name() + " is the " + day.dayOfWeek + " day of the week. Its Chinese name is: " + day.chineseName);

        }
    }
}
