package addressbook4Test;

import addressbook4Main.InvalidInputException;
import addressbook4Main.Validation;
import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 * import Test class
 * import assertEquals class
 */

public class ValidationTest {
	/**
     * test cases
     */
    @Test
    public void testValidateFirstName() {
        try {
            Validation obj = new Validation();
            String firstName = "Kumar";
            assertEquals(true, obj.validateFirstName(firstName));
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testValidateLastName() {
        try {
            Validation obj = new Validation();
            String lastName = "Bamankar";
            assertEquals(true, obj.validateLastName(lastName));
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testValidateAddress() {
        try {
            Validation obj = new Validation();
            String address = "Ulhasnagar";
            assertEquals(true, obj.validateAddress(address));
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testValidateCity() {
        try {
            Validation obj = new Validation();
            String city = "Mumbai";
            assertEquals(true, obj.validateCity(city));
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testValidateState() {
        try {
            Validation obj = new Validation();
            String state = "Maharashtra";
            assertEquals(true, obj.validateState(state));
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testValidateZip() {
        try {
            Validation obj = new Validation();
            String zip = "421002";
            assertEquals(true, obj.validateZip(zip));
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testValidateEmail() {
        try {
            Validation obj = new Validation();
            String email = "abc.xyz@cg.com";
            assertEquals(true, obj.validateEmail(email));
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testValidatePhoneNumber() {
        try {
            Validation obj = new Validation();
            String phoneNumber = "91 9876543210";
            assertEquals(true, obj.validatePhoneNumber(phoneNumber));
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }

}
