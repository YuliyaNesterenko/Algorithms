import org.junit.Assert;
import org.junit.Test;

public class MaxMinMeanTest {

    @Test
    public void TestMaxMinMean() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expectedResult = {5, 1, 3};

        MaxMinMean maxMinMean = new MaxMinMean();
        int[] actualResult = maxMinMean.getMaxMinMean(input);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test

    public void TestMaxMinMean1() {
        int[] input = {-3, 0, 155, -39, 1003};
        int[] expectedResult = {1003, -39, 223};

        MaxMinMean maxMinMean = new MaxMinMean();
        int[] actualResult = maxMinMean.getMaxMinMean(input);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}
