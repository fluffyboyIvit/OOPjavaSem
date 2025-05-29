
package lesson3.task1;

import java.util.Iterator;

public class Program {

    public static void main(String[] args) {
        Student vanya = new Student("Ivan", "Ivanov", "Ivanovich", 01);
        Student sanya = new Student("Alex", "Alexandrov", "Alexandrovich", 02);
        Student katya =new Student("Ekaterina", "katerinova", "Petrova", 03);

        StudyGroup sg = new StudyGroup();
        sg.addStudents(vanya);
        sg.addStudents(sanya);
        sg.addStudents(katya);
        Iterator<Student> iter = new StudyGroupIterator(sg);
        while (iter.hasNext()) {
         Student a =  iter.next();
         System.out.println(a.getFirstname()+" "+  a.getStud_id());
        }

         


    }
}