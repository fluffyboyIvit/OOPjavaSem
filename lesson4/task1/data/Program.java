
package lesson4.task1.data;

import java.util.Iterator;

public class Program {

    public static void main(String[] args) {
        Student vanya = new Student("Ivan", "Ivanov", "Ivanovich", 01,01L);
        Student sanya = new Student("Alex", "Alexandrov", "Alexandrovich", 02,02L);
        Student katya =new Student("Ekaterina", "katerinova", "Petrova", 03,03L);

        StudyGroup sg = new StudyGroup();
        sg.addStudents(vanya);
        sg.addStudents(sanya);
        sg.addStudents(katya);
        Iterator<Student> iter = new StudyGroupIterator(sg);
        while (iter.hasNext()) {
         Student a =  iter.next();
         System.out.println( a.getFirstName()+" "+  a.getStudID());
        }

         


    }
}