
package lesson4.taskHW1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonIterator <T extends Person> implements Iterator<T>{
    private int index;
    private List<T> personList;
    
    public PersonIterator(FamilyTree<T> familyTree){
        this.index = 0;
        this.personList = new ArrayList<>(familyTree.getPeople());
    }

    @Override
    public boolean hasNext() {
        return index < personList.size();
    }

    @Override
    public T next() {
        if(!hasNext()){
            return null;
        }
        return personList.get(index++);
    }
    
}