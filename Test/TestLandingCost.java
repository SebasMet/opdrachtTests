import com.company.toets.Main;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLandingCost {

    //Pairwise testing

    @Test
    public void landingCostTest() {
        //Arrange
        int expectedResult = 1089;
        //Act
        int actualResult = Main.costOfLanding(500,2,true,true);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void landingCostTest1() {
        //Arrange
        int expectedResult = 150;
        //Act
        int actualResult = Main.costOfLanding(500,3,false,false);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void landingCostTest2() {
        //Arrange
        int expectedResult = 1573;
        //Act
        int actualResult = Main.costOfLanding(3000,2,true,true);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void landingCostTest3() {
        //Arrange
        int expectedResult = 750;
        //Act
        int actualResult = Main.costOfLanding(3000,3,false,false);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void landingCostTest4() {
        //Arrange
        int expectedResult = 3993;
        //Act
        int actualResult = Main.costOfLanding(6000,2,true,true);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void landingCostTest5() {
        //Arrange
        int expectedResult = 3750;
        //Act
        int actualResult = Main.costOfLanding(6000,3,false,false);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
