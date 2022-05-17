import com.company.toets.Main;
import org.testng.Assert;
import org.junit.jupiter.api.Test;

public class TestPermissionToTakeOffMCDC {

    @Test
    public void PermissionToTakeOffTest() {
        //Arrange
        //==In Method==
        //Act
        boolean actualResult = Main.permissonToFly(true, 900, 30);
        //Assert
        Assert.assertTrue(actualResult);
    }

    @Test
    public void PermissionToTakeOffTest1() {
        //Arrange
        //==In Method==
        //Act
        boolean actualResult = Main.permissonToFly(false, 900, 30);
        //Assert
        Assert.assertFalse(actualResult);
    }

    @Test
    public void PermissionToTakeOffTest2() {
        //Arrange
        //==In Method==
        //Act
        boolean actualResult = Main.permissonToFly(true, 1100, 60);
        //Assert
        Assert.assertTrue(actualResult);
    }

    @Test
    public void PermissionToTakeOffTest3() {
        //Arrange
        //==In Method==
        //Act
        boolean actualResult = Main.permissonToFly(false, 1100, 60);
        //Assert
        Assert.assertFalse(actualResult);
    }
}
