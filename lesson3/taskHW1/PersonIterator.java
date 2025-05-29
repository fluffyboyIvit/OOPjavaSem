
package lesson3.taskHW1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonIterator implements Iterator<Person>{
    private int index;
    private List<Person> personList;
    
    public PersonIterator(FamilyTree familyTree){
        this.index = 0;
        this.personList = new ArrayList<>(familyTree.getPeople());
    }

    @Override
    public boolean hasNext() {
        return index < personList.size();
    }

    @Override
    public Person next() {
        if(!hasNext()){
            return null;
        }
        return personList.get(index++);
    }
    
}