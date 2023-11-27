import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider
    public Object[][] factorialCalculator() {
        return new Object[][] {
                {0,1},
                {1,1},
                {5, 120},
                {10,3628800},
        };
    }
}
