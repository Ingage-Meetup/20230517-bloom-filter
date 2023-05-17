import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    private Kata fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Kata();
    }

    @Test
    public void helloShouldReturnMessageWithSpecifiedName() {
        boolean[] myBitArray = new boolean[43];
        fixture.add("First", myBitArray);
        //assertEquals(String.format("Hello %s", name), fixture.hello(name));
    }
}
