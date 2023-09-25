package edu.desu.partB;

import java.util.ArrayList;
import java.util.List;

public class Cage<T extends Animal> {
    private List<T> animals;


    public Cage() {
        this.animals = new ArrayList<>();
    }
    public void addAnimal (T animal) {
        animals.add(animal);
    }
    public List<T> getAnimals(){
        return animals;
    }
    public String makeAllSounds(){
        String response = "";
        for (T animal : animals){
            response += (animal.makeSound());
        }
        return response;
    }
}
