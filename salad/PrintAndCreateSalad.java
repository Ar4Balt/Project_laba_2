package by.Ar4Balt.tunnikov.project_laba_2.salad;


import by.Ar4Balt.tunnikov.project_laba_2.vegetables.Vegetables;

import java.util.ArrayList;

public class PrintAndCreateSalad {
    public PrintAndCreateSalad(ArrayList<Vegetables> vegetables) {
        Salad salad = new Salad(vegetables);
        System.out.println(salad);
    }
}
