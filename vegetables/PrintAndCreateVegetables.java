package by.Ar4Balt.tunnikov.project_laba_2.vegetables;

import by.Ar4Balt.tunnikov.project_laba_2.data_files.WriteToTheFile;
import by.Ar4Balt.tunnikov.project_laba_2.salad.PrintAndCreateSalad;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAndCreateVegetables {
    public PrintAndCreateVegetables() {
        ArrayList<Vegetables> vegetables = new ArrayList<Vegetables>();
        Scanner scanner = new Scanner(System.in);

        vegetables.add(new Broccoli());
        vegetables.add(new Cabbage());

        PrintAndCreateSalad printAndCreateSalad = new PrintAndCreateSalad(vegetables);
        WriteToTheFile file = new WriteToTheFile(vegetables);
    }

}
