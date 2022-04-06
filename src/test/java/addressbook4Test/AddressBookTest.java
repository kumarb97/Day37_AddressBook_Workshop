package addressbook4Test;

import addressbook4Main.AddressBookService;
import addressbook4Main.InvalidInputException;
import addressbook4Main.Validation;

import org.junit.*;
public class AddressBookTest {
	/**
     * create an object for AddressBookMain class,object name as addressbook
     */
    AddressBookService addressbook = new AddressBookService();

    //UC1
    @Test
    public void givenDetails_WhenInFormat_ShouldReturnTrue() throws InvalidInputException {
        boolean result1 = addressbook.FirstNameCheck("Kumar");
        boolean result2 = addressbook.LastNameCheck("Bamankar");
        boolean result3 = addressbook.MobileCheck("91 9860644366");
        boolean result4 = addressbook.AddressCheck("ulhasnagar");
        boolean result5 = addressbook.EmailCheck("kumarbamankar@gmail.com");
        boolean result6 = addressbook.CityCheck("Mumbai");
        boolean result7 = addressbook.StateCheck("Maharashtra");
        boolean result8 = addressbook.ZIPCheck("421002");
        Assertions.assertEquals(true, result8);
    }

}
