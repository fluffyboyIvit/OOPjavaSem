
package lesson1.task2;

import java.util.ArrayList;

public class cat {

    private int id;
    private static int countPatients;


   
    private String age;
    private String name;
    
    public cat(String name,int age){
        this.name = name;
        this.age= String.valueOf(age);
        this.id = ++countPatients;

    }

    public cat(){
        this.name = "Street cat";
        this.id = ++countPatients;
        this.age = "без возраста";
    }
    


    public  String  getInfo(){
       return String.format(cat.this.name + cat.this.age);
    }
    public static void getPatientsInfo(cat names){
        System.out.println(names.id + " " + names.name + " " + names.age);
    }

}