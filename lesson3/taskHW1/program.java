package lesson3.taskHW1;


import java.io.IOException;
import java.util.List;

public class program {

    public static void main(String[] args) {
        //+++++++++++++++++++++create class+++++++++++++++++++++++++
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
        //+++++++++++++++++++++++++itetator+++++++++++++++++++++++
        Iterable<Person> it = familyTree;
        for (Person person : it) {
            // System.out.println(person.getName() +"<<< Iterable");
            System.out.println(person.getName() + person.getYear_of_birth());
        }

        System.out.println("======================");

        //++++++++++++++++fileOperation+++++++++++++++++++++++++++++++++++

        FileOperations fileOperations = new FileOperationsImpl();
        FileOperations fileOps = new FileOperationsImpl();

        try {
            fileOps.saveToFile(familyTree, "familyTree.dat");
            System.out.println("Family tree saved to file." );
        }  
        catch (IOException e) {
            e.printStackTrace();
        }

        FamilyTree loadedFamilyTree = null;
        try {
            loadedFamilyTree = fileOps.loadFromFile("familyTree.dat");
            System.out.println("FamilyTree loaded from file.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(loadedFamilyTree !=null){
            for(Person person: loadedFamilyTree.getPeople()){
                System.out.println("Loaded person: "+ person.getName() + ", "+"born in: "+person.getYear_of_birth() );
            }
        }


        //+++++++++++++++++++++++out child++++++++++++++++++
        // List<Person> johnchildren = familyTree.getChildren(john);
        // for (Person child : johnchildren) {
        //     System.out.println("John`s child: "+ child.getName());
        // }

        //========================sorted===============================
        familyTree.sortByBirthYear();
        for (Person person : it) {
            System.out.println(person.getName() + person.getYear_of_birth());
        }
        System.out.println("=================================");
        familyTree.sortByName();
        for (Person person : it) {
            System.out.println(person.getName() + person.getYear_of_birth());
        }


    }
}