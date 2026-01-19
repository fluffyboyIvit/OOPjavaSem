package lesson1.task1;
import java.util.ArrayList;
import java.util.Scanner;

import lesson1.task1.hotBeverage;
import lesson1.task1.hotBeverageWendingMachine;
public class Main {



    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        hotBeverage coffee = new hotBeverage( "coffee", 50);
        hotBeverage tea = new hotBeverage("tea", 25);
        coffee.setTemerature(65);
        tea.setTemerature(85);
        ArrayList<product> listproduct = new ArrayList<>();
        listproduct.add(tea);
        listproduct.add(coffee);
        hotBeverageWendingMachine wend = new hotBeverageWendingMachine(listproduct);
        System.out.println("Выберите продукт: ");
        for (int i = 0; i<listproduct.size();i++) {
            System.out.print( i+1 + ")");
            System.out.println(listproduct.get(i).getName() + " ");
        }
        int index = scnr.nextInt();
        String nameproduct = null;
        if (index<=2 && index>0) {
            nameproduct = listproduct.get(--index).getName();
        }
        else{
            System.out.println("ошибка выбора!");
            return;

        }
        double volume = 0.5;
        
        hotBeverage beverage= wend.getProduct(nameproduct,volume);
        System.out.println(beverage.getName() + " volume - " + beverage.getVolume());

    }
}
