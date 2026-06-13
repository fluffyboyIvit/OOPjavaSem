package lesson4.task1.data;

public abstract class User {

    private String firstName;
    private String middleName;
    private String lastName;
    private Integer dateOfBirth;
    

    public User(String firstName, String middleName, String lastname,Integer dateOfBirth) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastname;
        this.dateOfBirth = dateOfBirth;
    }
    public User(String firstName, String middleName, String lastName){
        this.firstName= firstName;
        this.middleName= middleName; 
        this.lastName= lastName;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public Integer getDateOfBirth(){
        return dateOfBirth;
    }

     @Override
    public String toString() {
        return "User{" +
               "firstName='" + firstName + '\'' +
               ", middleName='" + middleName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", dateOfBirth=" + dateOfBirth +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

        if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) :
                user.getFirstName() != null) {
            return false;
        }
        if (getMiddleName() != null ? !getMiddleName().equals(user.getMiddleName()) :
                user.getFirstName() != null) {
            return false;
        }
        if (getLastName() != null ? !getLastName().equals(user.getLastName()) :
                user.getLastName() != null) {
            return false;
        }
        return getDateOfBirth() != null ? getDateOfBirth().equals(user.getDateOfBirth()) :
                user.getDateOfBirth() == null;
    }
}

