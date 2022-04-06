package addressbook4Main;
/**
 * created a class Contact
 */
public class Contact {
	
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    /**
     * create default constructor name as Contact
     */
    public Contact() {
    }
    /**
     * create parameterized constructor name as Contact
     * @param firstName - person first name in address book
     * @param lastName - person last name in address book
     * @param address - person address in address book
     * @param city - person city in address book
     * @param state - person state in address book
     * @param zip - person zip code in address book
     * @param phoneNumber - persons phoneNumber in address book
     * @param email - persons emailID in address book
     */
    public Contact(String firstName, String lastName, String address, String city, String state, String zip,
                   String phoneNumber, String email) {
        /**
         *  The "this" keyword is used to refer to the current object.
         */
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /**
     * Used getter and setter to set and get the value.
     * Setter is used to set the value
     * Getter is used to get the value
     */
   
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getZip() {
        return zip;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
       
    /**
     * Created To string method
     */   
    public String toString() {
        return String.format("Name: %s %s\nAddress: %s, %s, %s, %s\nPhone Number: %s\nEmail: %s", firstName, lastName,
                address, city, state, zip, phoneNumber, email);
    }
}
