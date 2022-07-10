package fang.java.lessons;

public enum DaysOfTheWeek {
    SUNDAY(0, "ZhouRi"),
    MONDAY(1, "ZhouYi"),
    TUESDAY(2, "ZhouEr"),
    WEDNESDAY(3, "ZhouSan"),
    THURSDAY(4, "ZhouSi"),
    FRIDAY(5, "ZhouWu"),
    SATURDAY(6, "ZhouLiu");

    final int dayOfWeek;
    final String chineseName;

    DaysOfTheWeek(int dayOfWeek, String chineseName) {
        this.dayOfWeek = dayOfWeek;
        this.chineseName = chineseName;
    }
}
