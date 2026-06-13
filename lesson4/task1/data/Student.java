package lesson4.task1.data;

public class Student extends User implements Comparable<Student>{

    private Long studID;

    public Student(String firstName, String middleName, String lastname, Integer dateOfBirth,Long studID) {
        super(firstName, middleName, lastname, dateOfBirth);
        this.studID = studID;
    }
    public Student(String firstName, String middleName, String lastName){
        super(firstName, middleName, lastName);
        this.studID = null;
    }

@Override
public String toString() {
 return "Student{" +
               "studentId='" + studID +'\'' +
               ", firstName='" + super.getFirstName() + '\'' +
               ", secondName='" + super.getMiddleName() + '\'' +
               ", patronymic='" + super.getLastName() + '\'' +
               ", dateOfBirth=" + super.getDateOfBirth() +
               '}';
}
    @Override
    public int compareTo(Student o) {
       return this.studID.compareTo(o.studID) ;
    }
    public Long getStudID() {
        return studID;
    }
}