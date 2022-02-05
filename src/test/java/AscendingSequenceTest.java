import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {
    @Test
    public void TestAscendingSequence(){
        int a = 10;
        int b = 25;
        int n = 5;
        int[] expectedResult = {10, 15, 20, 25};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.getAscendingSequence(a,b,n);

        Assert.assertArrayEquals(expectedResult,
                actualResult);
    }
    public void TestAscendingSequence1(){
        int a = 10;
        int b = -25;
        int n = -5;
        int[] expectedResult = {-1};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.getAscendingSequence(a,b,n);

        Assert.assertArrayEquals(expectedResult,
                actualResult);
    }
    public void TestAscendingSequence2(){
        int a = 10;
        int b = 10;
        int n = 2;
        int[] expectedResult = {-1};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.getAscendingSequence(a,b,n);

        Assert.assertArrayEquals(expectedResult,
                actualResult);
    }
}
