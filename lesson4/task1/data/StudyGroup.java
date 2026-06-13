
package lesson4.task1.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup  implements Iterable<Student>{
    protected int index ;
    protected List<Student> students;

    public StudyGroup() {
        this.students = new ArrayList<>();
        this.index = 0;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public void addStudents(Student student){
        this.students.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudyGroupIterator(this);
    }

    public  void createStudent(String firstName, String middleName, String lastName){
        students.add(new Student(firstName, middleName, lastName));
    };

    

}

    


    
