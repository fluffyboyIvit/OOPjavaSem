package lesson1.taskHW1;
import java.util.ArrayList;
import java.util.List;
public class FamilyTree {

    private List<Person> people;

    public void setPeople(Person persons) {
        this.people.add(persons);
    }

    public FamilyTree() {
        this.people = new ArrayList<>();
    }
    public void addPerson(Person person){
        this.people.add(person);
    }
    public List<Person> getChildren(Person parent){
        return parent.getChild();
    }
    public Person findPersonByName(String name){
        for(Person person:people){
            if(person.getName().equals(name)){
                return person;
            }
        }
        return null;
    }

    
}
