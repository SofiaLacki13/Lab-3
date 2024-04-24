
//put file into employees package
package employees;


public class Employee { //start of Employee class
    protected final String firstName;
    protected final String lastName;
    protected final String socialSecurityID;

    public Employee(String firstName, String lastName, String socialSecurityID) { //assign variables
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityID = socialSecurityID;
    } //end variable assignments

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

    //toString method with all employee information
    public String toString() {
        return String.format("%s: %s %s%n%s: %s", 
         "commission employee", getFirstName(), getLastName(), 
         "social security number", getSocialSecurityID());
    }
}
