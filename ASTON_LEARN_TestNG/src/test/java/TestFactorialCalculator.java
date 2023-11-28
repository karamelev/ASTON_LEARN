import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;


public class TestFactorialCalculator {
    FactorialCalculator calculator = new FactorialCalculator();
    @Test (dataProvider = "factorialCalculator",dataProviderClass = TestData.class)
    public void testFactorialCalculator (int input, int result) {
        if (input>=0) {
            Assert.assertEquals(result, calculator.factorialCalculator(input));
        } else {
            assertThrows(IllegalArgumentException.class, ()->calculator.factorialCalculator(input));
        }
    }
}
