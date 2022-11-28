package by.Ar4Balt.tunnikov.project_laba_2.data_files;

import by.Ar4Balt.tunnikov.project_laba_2.salad.Salad;
import by.Ar4Balt.tunnikov.project_laba_2.vegetables.Vegetables;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteToTheFile {
    public WriteToTheFile() {
    }

    public WriteToTheFile(ArrayList<Vegetables> vegetables, String nameSalad) {
        Salad salad = new Salad(vegetables, nameSalad);
        try {
            File fileSalad = new File("dataSaladFile.txt");

            if (!fileSalad.exists()) {
                fileSalad.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(fileSalad);
            printWriter.println(salad);
            printWriter.close();
        } catch (IOException error) {
            System.out.println("Error: " + error);
        }
        try {
            File fileVegetables = new File("dataVegetablesFile.txt");
            if (!fileVegetables.exists()) {
                fileVegetables.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(fileVegetables);
            printWriter.println(vegetables);
            printWriter.close();
        } catch (IOException error) {
            System.out.println("Error: " + error);
        }
    }
}
