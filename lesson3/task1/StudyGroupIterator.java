
package lesson3.task1;

import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<Student>{
    private int index;
    List<Student> st;
    public StudyGroupIterator(StudyGroup studyGroup){
        index = 0;
        this.st = studyGroup.getStudents();
    }
    @Override
    public boolean hasNext() {
        return index < st.size();
    }
    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        }
        return st.get(index++);
    }
    @Override
    public void remove() {
        st.remove(index);
    }

    
    }