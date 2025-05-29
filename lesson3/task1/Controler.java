
package lesson3.task1;

import java.util.List;

public class Controler {

    private final StudyGroupService studyGroupService =new StudyGroupService();
        public void removeStudentByFIO(String firstname, String lastname, String middlename){
            studyGroupService.removeStudentByFIO(firstname, lastname, middlename);
        }
    public List<Student> getSortedStudentList(){
        return studyGroupService.getSortedStudentList();
    }
     public List<Student> getSortedStudentFIO(){
        return studyGroupService.getSortedStudentFIO();
     }
}