package edu.desu.partB;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    private Cat cat;

    @BeforeEach
    public void setUp() {
        cat = new Cat("Biscuits");
    }

    @Test
    public void testMakeSound() {
        assertEquals("Meow!", cat.makeSound());
    }
    public void testName() {
        assertEquals("Biscuits", cat.getName());
    }

    // Add any other tests specific to the Cat class here.
}