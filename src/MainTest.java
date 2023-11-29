
import java.util.*;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


public class MainTest {

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void example() {
        int[] input = {4, 2, 5, 1, 3};
        new Main().sort(input);
        Assertions.assertArrayEquals(new int[] {1, 2, 3, 4, 5}, input);
    }
}
