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

    public WriteToTheFile(ArrayList<Vegetables> vegetables) {
        Salad salad = new Salad(vegetables);
        try {
            File file = new File("D:\\VS Code\\Programms\\Java\\Project_laba_2\\src\\by\\Ar4Balt\\tunnikov\\project_laba_2\\data_files\\dataFile.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(salad);
            printWriter.close();
        } catch (IOException error) {
            System.out.println("Error: " + error);
        }
    }
}
