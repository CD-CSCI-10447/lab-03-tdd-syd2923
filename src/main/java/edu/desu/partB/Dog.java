package edu.desu.partB;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }
}

// ... More animals as desired.