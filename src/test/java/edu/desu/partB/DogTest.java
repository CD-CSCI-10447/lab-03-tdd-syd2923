package edu.desu.partB;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest {

    private Dog dog;

    @BeforeEach
    public void setUp() {
        dog = new Dog("Rex");
    }

    @Test
    public void testMakeSound() {
        assertEquals("Woof!", dog.makeSound());
    }

    // Add any other tests specific to the Dog class here.
}
