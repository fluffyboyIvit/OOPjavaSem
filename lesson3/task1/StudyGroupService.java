
package lesson3.task1;

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
            if(student.getFirstname().equals(firstname)&& student.getLastname().equals(lastname)&&student.getMiddlename().equals(middlename)){
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
        studentsList.sort(new studentcomparator());
        return studentsList;
    }

}