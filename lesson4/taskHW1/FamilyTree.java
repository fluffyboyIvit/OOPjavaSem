package lesson4.taskHW1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

class FamilyTree <T> implements Serializable, Iterable<T> {
    private static final long serialVersionUID = 1L;
    private List<T> persons;
    public FamilyTree() {
        this.persons = new ArrayList<>();
    }
    public void addPerson(T person) {
        this.persons.add(person);
    }
    // public List<T> getChildren(T parent) {
    //     return parent.getChild();
    // }
    // public T findPersonByName(String name) {
    //     for (T person : persons) {
    //         if (person.getName().equals(name)) {
    //             return person;
    //         }
    //     }
    //     return null;
    // }
    public List<T> getPeople() {
        return persons;
    }
    @Override
    public Iterator<T> iterator() {
        return  persons.iterator();
    }

    public void sortByName() {
        Collections.sort(persons, (p1, p2) -> p1.toString().compareTo(p2.toString()));
    }
    public void sortByBirthYear() {
        Collections.sort(persons, (p1, p2) -> Integer.compare(((Person)p1).getYear_of_birth(), ((Person) p2).getYear_of_birth()));
    }

}
