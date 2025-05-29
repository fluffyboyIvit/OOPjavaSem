
package lesson3.task1;

public class Student implements Comparable<Student> {

    private String firstname;
    private String lastname;
    private String middlename;
    private int stud_id;
    
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public int getStud_id() {
        return stud_id;
    }

    public Student(String firstname, String lastname, String middlename, int stud_id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.middlename = middlename;
        this.stud_id = stud_id;
    }

    @Override
    public int compareTo(Student student) {
        return this.firstname.compareTo(student.firstname);
    }
    



}