import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void hypothenuseReturnsExpectedValue() {
        Assertions.assertEquals(5.0, Main.hypothenuse(3.0, 4.0));
    }
}
