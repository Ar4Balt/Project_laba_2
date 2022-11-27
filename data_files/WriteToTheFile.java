package by.Ar4Balt.tunnikov.project_laba_2.data_files;

import by.Ar4Balt.tunnikov.project_laba_2.salad.PrintAndCreateSalad;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToTheFile {

    public WriteToTheFile(PrintAndCreateSalad neme) {
        try {
            File file = new File("dataFile.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(file);

            printWriter.close();
        } catch (
                IOException error) {
            System.out.println("Error: " + error);
        }
    }
}
