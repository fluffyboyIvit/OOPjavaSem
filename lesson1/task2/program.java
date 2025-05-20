package lesson1.task2;

import java.util.ArrayList;

public class program {

    public static void main(String[] args) {
        ArrayList<cat> patient = new ArrayList<>();
        cat streetCat1 = new cat ();
        cat barsik = new cat("barsik",5);
        cat streetCat2 = new cat();
        

        cat.getPatientsInfo(barsik);
        cat.getPatientsInfo(streetCat2);
        cat.getPatientsInfo(streetCat1);

        
    }
}