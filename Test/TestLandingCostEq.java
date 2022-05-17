import com.company.toets.Main;

import org.junit.jupiter.api.Test;
import org.testng.Assert;


public class TestLandingCostEq {

    @Test
    public void PermissionToFlyTest() {
        //Arrange
        int expectedResult = 100;
        //Act
        int actualResult = Main.costOfLanding(0, 0, false, false);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void PermissionToFlyTest1() {
        //Arrange
        int expectedResult = 100;
        //Act
        int actualResult = Main.costOfLanding(1, 0, false, false);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void PermissionToFlyTest2() {
        //Arrange
        int expectedResult = 100;
        //Act
        int actualResult = Main.costOfLanding(999, 0, false, false);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void PermissionToFlyTest3() {
        //Arrange
        int expectedResult = 500;
        //Act
        int actualResult = Main.costOfLanding(1000, 0, false, false);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void PermissionToFlyTest4() {
        //Arrange
        int expectedResult = 500;
        //Act
        int actualResult = Main.costOfLanding(1001, 0, false, false);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void PermissionToFlyTest5() {
        //Arrange
        int expectedResult = 500;
        //Act
        int actualResult = Main.costOfLanding(4999, 0, false, false);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void PermissionToFlyTest6() {
        //Arrange
        int expectedResult = 2500;
        //Act
        int actualResult = Main.costOfLanding(5000, 0, false, false);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void PermissionToFlyTest7() {
        //Arrange
        int expectedResult = 2500;
        //Act
        int actualResult = Main.costOfLanding(5001, 0, false, false);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
