import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPass {


    @Test
    public void testHello() {
        Animal dog = Animal.create("dog", 4);
        assertEquals("dog", dog.name());
    }

}
