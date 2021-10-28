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

	@Test
	public void givenLastName_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.lastName("Bagale");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.lastName("bagale");
		Assert.assertEquals(false, result);

	}

	/*
	 * methods to check mail Addresss
	 */
	@Test
	public void givenEmail_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.emailAddress("abc@gmail.com.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.emailAddress("abc()*@gmail.com");
		Assert.assertEquals(false, result);
	}

	/*
	 * test cases for mobile number validation
	 */
	@Test
	public void givenPhoneNumber_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.phoneNumber("91 9604315270");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPhoneNumber_WhenOurOfFormat_ShouldReturnFlase() {
		boolean result = userRegistration.phoneNumber("+91 9604315270");
		Assert.assertEquals(false, result);
	}

}