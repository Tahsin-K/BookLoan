package se.lexicon;

public class Person {

    private int ID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Book book;
    
    public Person(String firstName, String lastName, String email, String phoneNumber){
        setFirstName(firstName);
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.ID = ID;
    }
    
    
    public String getPersonInformation(){
        return "  FirstName  " +  firstName  +  " lastname   "   +    lastName  +  " email  "    +   email +    " phonenumber   "  +  phoneNumber +    " PersonalID " +  ID ;
    }
    
  

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName == null)
            throw new IllegalStateException("Cannot register without firstname");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
