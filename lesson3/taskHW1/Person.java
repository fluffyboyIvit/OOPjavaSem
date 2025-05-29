
package lesson3.taskHW1;

import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;

public class Person  implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private int year_of_birth;

    private Person mother;
    private Person father;
    private List<Person> child;




    public Person(String name, int year_of_birth) {
        this.name = name;
        this.year_of_birth = year_of_birth;
        this.child = new ArrayList<>();
    }
    public void setMother(Person mother) {
        this.mother = mother;
    }
    public void setFather(Person father) {
        this.father = father;
    }
    public void addChild(Person ch) {
        this.child.add(ch);
    }


    public String getName() {
        return name;
    }
    public int getYear_of_birth() {
        return year_of_birth;
    }
    public Person getMother() {
        return mother;
    }
    public Person getFather() {
        return father;
    }
    public List<Person> getChild() {
        return child;
    }
    

}