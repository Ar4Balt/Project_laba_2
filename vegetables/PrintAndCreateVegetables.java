package by.Ar4Balt.tunnikov.project_laba_2.vegetables;

import by.Ar4Balt.tunnikov.project_laba_2.salad.PrintAndCreateSalad;

import java.util.ArrayList;

public class PrintAndCreateVegetables {
    public PrintAndCreateVegetables() {
        ArrayList<Vegetables> vegetables = new ArrayList<Vegetables>();
//        Scanner scanner = new Scanner(System.in);
//        switch (scanner){
//
//        }
        vegetables.add(new Broccoli());
        vegetables.add(new Cabbage());
//        for (int i = 0; i < vegetables.size(); i++) {
//            System.out.println(i + "): \n"
//                    + vegetables.get(i));
//        }
        PrintAndCreateSalad salad = new PrintAndCreateSalad(vegetables);

    }




}
