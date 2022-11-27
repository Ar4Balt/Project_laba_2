package by.Ar4Balt.tunnikov.project_laba_2.vegetables;

import by.Ar4Balt.tunnikov.project_laba_2.salad.PrintAndCreateSalad;

import java.util.ArrayList;

public class PrintAndCreateVegetables {
    public PrintAndCreateVegetables() {
        ArrayList<Vegetables> vegetables = new ArrayList<Vegetables>();
        vegetables.add(new Potato());
        vegetables.add(new Potato());
        for (int i = 0; i < vegetables.size(); i++) {
            System.out.println(i + "): \n"
                    + vegetables.get(i));
        }
        PrintAndCreateSalad salad = new PrintAndCreateSalad(vegetables);

    }




}
