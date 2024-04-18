

public class Employee {
    protected final String firstName;
    protected final String lastName;
    protected final String socialSecurityID;

    public Employee(String firstName, String lastName, String socialSecurityID) {
        this.firstName = firstName;
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

    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s:", 
         "commission employee", getFirstName(), getLastName(), 
         "social security number", getSocialSecurityID());
    }
}
