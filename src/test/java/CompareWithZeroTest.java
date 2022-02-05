import org.junit.Assert;
import org.junit.Test;

public class CompareWithZeroTest {
    @Test
    public void TestCompareWithZero() {
        int number = 555;
        boolean expectedResult = true;

        CompareWithZero compareWithZero = new CompareWithZero();
        boolean actualResult = compareWithZero.getCompareWithZero(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TestCompareWithZero1() {
        int number = -555;
        boolean expectedResult = false;

        CompareWithZero compareWithZero = new CompareWithZero();
        boolean actualResult = compareWithZero.getCompareWithZero(number);

        Assert.assertEquals(expectedResult, actualResult);
    }
}

