package by.Ar4Balt.tunnikov.project_laba_2.salad;


import by.Ar4Balt.tunnikov.project_laba_2.vegetables.Vegetables;

import java.util.ArrayList;

public class PrintAndCreateSalad {
    Salad salad;

    public PrintAndCreateSalad() {
        System.out.println(salad.toString());
    }

    public PrintAndCreateSalad(ArrayList<Vegetables> vegetables) {
        salad = new Salad(vegetables);
    }

    public PrintAndCreateSalad(ArrayList<Vegetables> ingredientsForSalad, String saladName, boolean print) {
        salad = new Salad(ingredientsForSalad, saladName);
        if (print) {
            System.out.println(salad.toString());
        }
    }

    public PrintAndCreateSalad(String saladName) {
        salad = new Salad(saladName);
    }
}
