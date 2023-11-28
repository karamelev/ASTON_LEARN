import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestFactorialCalculator {
    FactorialCalculator calculator = new FactorialCalculator();

    @ParameterizedTest
    @CsvSource(value = {
            "0,1",
            "1,1",
            "5,120",
            "-10,3628800"
    })
    public void testFactorialCalculator(int input, int result) {
        if (input >= 0) {
            Assertions.assertEquals(result, calculator.factorialCalculator(input));
        } else {
            Throwable exception = assertThrows(IllegalArgumentException.class, () -> calculator.factorialCalculator(-5));
            assertEquals(exception.getMessage(), "Факториал отрицательного числа не определен");
        }
    }
}


