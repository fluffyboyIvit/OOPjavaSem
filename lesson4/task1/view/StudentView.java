
package lesson4.task1.view;

import java.util.List;

import lesson4.task1.data.Student;

public class StudentView implements UserView<Student> {

    @Override
        public void sendOnConsole(List<Student> list) {
            for (Student student : list) {
                System.out.println(student.getStudID());
            }
        };
}