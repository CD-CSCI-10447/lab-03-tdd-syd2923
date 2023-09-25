package edu.desu.partB;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Every animal makes a sound. Let's make this method abstract.
    public abstract String makeSound();
}
