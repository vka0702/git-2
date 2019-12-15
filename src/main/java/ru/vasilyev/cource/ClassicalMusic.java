package ru.vasilyev.cource;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    @Override
    public String getSong() {
        return "Nocturne №9";
    }

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("Creation of new instance");
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("My initialisation");
    }

    public void doMyDestroy() {
        System.out.println("My destruction");
    }
}
