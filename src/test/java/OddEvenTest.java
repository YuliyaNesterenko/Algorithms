import org.junit.Assert;
import org.junit.Test;

public class OddEvenTest {
    @Test
    public void testOddEven() {
        int number = -345;
        String expectedResult = "Odd";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.getOddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    public void testOddEven2() {
        int number = 0;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.getOddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    public void testOddEven3() {
        int number = 222222;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.getOddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    public void testOddEven4() {
        int number = 2147483647 + 1;
        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.getOddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }
}

