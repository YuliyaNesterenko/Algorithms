import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class OddIndexTest {

    @Test
    public void TestOddIndex() {
        int[] numbers = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndex oddIndex = new OddIndex();
        int[] actualResult = oddIndex.getOddIndex(numbers);
        System.out.println(Arrays.toString(actualResult));

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}

