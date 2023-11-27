import org.testng.Assert;
import org.testng.annotations.Test;


public class TestFactorialCalculator {
    FactorialCalculator calculator = new FactorialCalculator();
    @Test (dataProvider = "factorialCalculator",dataProviderClass = TestData.class)
    public void testFactorialCalculator (int input, int result) {
        Assert.assertEquals(result, calculator.factorialCalculator(input));
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void testFactorialCalculatorForNegativeNumber () {
         calculator.factorialCalculator(-5);

    }
}
