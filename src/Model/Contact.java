package Model;

public class Contact{
    private String phone;
    private String firstName;
    private String lastName;
    private String middleName;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fullNm) {
        this.firstName = fullNm;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Contact (String firstName, String lastName,String middleName, String phone) {
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }
    public Contact(String firstName, String lastName, String phone) {
        this(firstName,lastName,"-",phone);

    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s", lastName,firstName, middleName, phone);
    }
    @Override
    public boolean equals(Object obj) {
        Contact c = (Contact) obj;
        return this.firstName.equals(c.firstName) &&
                this.lastName.equals(c.lastName)
                ;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
