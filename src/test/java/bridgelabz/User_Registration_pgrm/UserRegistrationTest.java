package bridgelabz.User_Registration_pgrm;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.User_Registration_pgrm.UserRegistration;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();


    @Test
    public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Sandhya");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
        boolean result = userRegistration.firstName("Sandhya");
        Assert.assertEquals(false, result);
    }


}