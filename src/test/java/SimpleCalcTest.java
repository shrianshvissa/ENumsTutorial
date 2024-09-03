// allows us to use @Test above test methods
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalcTest {
    SimpleCalc easyCalc;

    @BeforeEach
    void setUp () {
        easyCalc = new SimpleCalc();
    }

    @DisplayName("Addition method with two positive numbers")
    @Test
    void add_twoPositive_shouldPassWithSum () { // Naming Convention (Mirah): method name, type of parameter, expected output
        int sum = easyCalc.add(5 , 6);
        assertEquals(11, sum);
    }

    @DisplayName("Division method divisor 0 throw")
    @Test
    void division_divisorNeg_shouldThrowExp () {
        assertThrows(IllegalArgumentException.class, () -> easyCalc.division(-9, 7));
    }

    @DisplayName("isOdd all odds")
    @ParameterizedTest
    @ValueSource(ints = {1, 5, 9 -15, -3, 21, 99})
    void isOdd_allOdds_shouldReturnTrue(int num) {
        boolean isOdd = easyCalc.isOddNumber(num);
        assertTrue(isOdd);
    }

    @DisplayName("isOdd all evens")
    @ParameterizedTest
    @ValueSource(ints = {4, 22, 98})
    void isOdd_allEvens_shouldReturnFalse(int num) {
        boolean isOdd = easyCalc.isOddNumber(num);
        assertFalse(isOdd);
    }
}