
package lesson4.task1.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudyGroupService {

    private StudyGroup studentGroup;
    public void removeStudentByFIO(String firstname, String lastname, String middlename){
        Iterator<Student> iterator = studentGroup.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getFirstName().equals(firstname)&& student.getLastName().equals(lastname)&&student.getMiddleName().equals(middlename)){
                iterator.remove();
            }
        }
    }

    public List<Student> getSortedStudentList(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudents());
        Collections.sort(studentList);
        return studentList;
    }
    public List<Student> getSortedStudentFIO(){
        List<Student> studentsList = new ArrayList<>(studentGroup.getStudents());
        studentsList.sort(new UserComparator<>());
        return studentsList;
    }
    public void createStudent(String firstName, String middleName, String lastname){
        studentGroup.createStudent(firstName, middleName, lastname);
    }

}