
package lesson4.task1.controller;

import lesson4.task1.data.Student;
import lesson4.task1.data.StudyGroup;
import lesson4.task1.data.StudyGroupService;
import lesson4.task1.view.StudentView;

import java.util.List;

public class StudentControler implements UserController<Student> {

    private final StudentView studentView = new StudentView();
    private final StudyGroupService studyGroupService =new StudyGroupService();
        public void removeStudentByFIO(String firstname, String lastname, String middlename){
            studyGroupService.removeStudentByFIO(firstname, lastname, middlename);
        }
    public List<Student> getSortedStudentList(){
        List<Student> studentsList = studyGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentsList);
        return studentsList;
    }
     public List<Student> getSortedStudentFIO(){
        List <Student> studentList =  studyGroupService.getSortedStudentFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
     }
    @Override
    public void create(String firstName, String middleName, String lastName) {
        // TODO Auto-generated method stub
        studyGroupService.createStudent(firstName, middleName, lastName);
        
    }
}