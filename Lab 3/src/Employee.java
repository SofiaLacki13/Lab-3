

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityID;

    public Employee(String firstName, String lastName, String socialSecurityID) {
        this.firstNamt = firstName;
        this.lastName = lastName;
        this.socialSecurityID = socialSecurityID;
    }

    // return first name
    public String getFirstName() {
        return firstName;
    }

    // return last name
    public String getLastName() {
        return lastName;
    }

    // return social security number
    public String getSocialSecurityID() {
        return socialSecurityID;
    } 
}
