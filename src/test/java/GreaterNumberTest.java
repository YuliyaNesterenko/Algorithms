import org.junit.Assert;
import org.junit.Test;

public class GreaterNumberTest {
    @Test
    public void TestGreaterNumber() {
        int one = 3333;
        int two = 9999;
        int expectedResult = 9999;

        GreaterNumber greaterNumber = new GreaterNumber();
        int actualResult = greaterNumber.getGreaterNumber(one, two);

        Assert.assertEquals(expectedResult, actualResult);
    }
}

