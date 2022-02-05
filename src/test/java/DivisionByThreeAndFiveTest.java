import org.junit.Assert;
import org.junit.Test;

public class DivisionByThreeAndFiveTest {
    @Test
    public void TestDivisionByThreeAndFive() {
        int m = 15;
        String expectedResult = "Good Number";

        DivisionByThreeAndFive divisionByThreeAndFive = new DivisionByThreeAndFive();
        String actualResult = divisionByThreeAndFive.getResult(m);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TestDivisionByThreeAndFive1() {
        int m = 55;
        String expectedResult = "Poor Number";

        DivisionByThreeAndFive divisionByThreeAndFive = new DivisionByThreeAndFive();
        String actualResult = divisionByThreeAndFive.getResult(m);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TestDivisionByThreeAndFive2() {
        int m = 6;
        String expectedResult = "Bad number";

        DivisionByThreeAndFive divisionByThreeAndFive = new DivisionByThreeAndFive();
        String actualResult = divisionByThreeAndFive.getResult(m);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TestDivisionByThreeAndFive3() {
        int m = 8;
        String expectedResult = "-1";

        DivisionByThreeAndFive divisionByThreeAndFive = new DivisionByThreeAndFive();
        String actualResult = divisionByThreeAndFive.getResult(m);

        Assert.assertEquals(expectedResult, actualResult);
    }
}


