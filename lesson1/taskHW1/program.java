
package lesson1.taskHW1;

import java.util.List;

public class program {

    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        Person john = new Person("john", 1950);
        Person mary = new Person("mary", 1955);
        Person susan = new Person("susan", 1980);

        susan.setMother(mary);
        susan.setFather(john);
        john.addChild(susan);
        mary.addChild(susan);

        familyTree.addPerson(john);
        familyTree.addPerson(mary);
        familyTree.addPerson(susan);

        List<Person> johnchildren = familyTree.getChildren(john);
        for (Person child : johnchildren) {
            System.out.println("John`s child: "+ child.getName());
        }

    }
}