
package lesson3.task1;

import java.util.Comparator;

public class studentcomparator implements Comparator<Student>{

    @Override
    public int compare(Student student1, Student student2) {
        int resultOfComparing = student1.getFirstname().compareTo(student2.getFirstname());
        if(resultOfComparing ==0){
            resultOfComparing = student1.getLastname().compareTo(student2.getLastname());
            if(resultOfComparing == 0){
                return student1.getMiddlename().compareTo(student2.getMiddlename());
            }else return resultOfComparing;
        } else return resultOfComparing;
    }

    
}