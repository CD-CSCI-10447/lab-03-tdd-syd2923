package edu.desu.partB;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CageTest {

    private Cage<Cat> catCage;
    private Cage<Dog> dogCage;


    @BeforeEach
    public void setUp() {
        catCage = new Cage<>();
        dogCage = new Cage<>();
    }

    @Test
    public void testAddCat() {
        Cat biscuits = new Cat("Biscuits");
        catCage.addAnimal(biscuits);

        assertEquals(1, catCage.getAnimals().size());
        assertTrue(catCage.getAnimals().contains(biscuits));
    }

    @Test
    public void testMakeCatSounds() {
        Cat biscuits = new Cat("Biscuits");
        Cat fluffy = new Cat("Fluffy");

        catCage.addAnimal(biscuits);
        catCage.addAnimal(fluffy);

        String expectedSound = "Meow!Meow!";
        assertEquals(expectedSound, catCage.makeAllSounds());
    }

    @Test
    public void testAddDog() {
        Dog max = new Dog("Max");
        dogCage.addAnimal(max);

        assertEquals(1, dogCage.getAnimals().size());
        assertTrue(dogCage.getAnimals().contains(max));
    }

    @Test
    public void testMakeDogSounds() {
        Dog rex = new Dog("Max");
        Dog buddy = new Dog("Stan");

        dogCage.addAnimal(rex);
        dogCage.addAnimal(buddy);

        String expectedSound = "Woof!Woof!";
        assertEquals(expectedSound, dogCage.makeAllSounds());
    }

}
