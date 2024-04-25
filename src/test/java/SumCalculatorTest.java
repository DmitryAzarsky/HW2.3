import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void createSumCalculatorObject() {
        sumCalculator = new SumCalculator();
    }

    @AfterEach
    public void clearSumCalculatorObject() {
        sumCalculator = null;
    }

    @Test
    public void sumTestWithValue1() {
        //Given
        int testedValue = 1;
        int expected = 1;
        //When
        int actual = sumCalculator.sum(testedValue);
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sumTestWithValue3() {
        //Given
        int testedValue = 3;
        int expected = 6;
        //When
        int actual = sumCalculator.sum(testedValue);
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sumTestWithValue0() {
        //Given
        int testedValue = 0;
        //Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(testedValue));
    }
}
