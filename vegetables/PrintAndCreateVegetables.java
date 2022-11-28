package by.Ar4Balt.tunnikov.project_laba_2.vegetables;

import by.Ar4Balt.tunnikov.project_laba_2.data_files.WriteToTheFile;
import by.Ar4Balt.tunnikov.project_laba_2.salad.PrintAndCreateSalad;
import by.Ar4Balt.tunnikov.project_laba_2.salad.Salad;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PrintAndCreateVegetables {
    ArrayList<Vegetables> vegetables = new ArrayList<Vegetables>();
    PrintAndCreateSalad printAndCreateSalad;
    public PrintAndCreateVegetables() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            fencing();
            System.out.print("Menu!\n"
                    + "0: Exit;\n"
                    + "1: Add your own vegetables from the list;\n"
                    + "2: Add random vegetables;\n"
                    + "3: Add all existing vegetables;\n"
                    + "4: Name a salad;\n"
                    + "5: Create a text file with a list of salad ingredients;\n"
                    + "6: Output information about the salad;\n"
                    + ">> "
            );

            int choose;
            try {
                choose = scanner.nextInt();
                fencing();

                if (choose == 0) {
                    printAndCreateSalad = new PrintAndCreateSalad(vegetables);
                    break;
                }
                if (choose == 1) {
                    System.out.print("List of existing vegetables:\n"
                            + "0: Go back\n"
                            + "1: Add Broccoli;\n"
                            + "2: Add Cabbage;\n"
                            + "3: Add Carrot;\n"
                            + "4: Add Mushroom;\n"
                            + "5: Add Onion;\n"
                            + "6: Add Potato;\n"
                            + "7: Add Tomato;\n"
                            + "8: Add Cucumber;\n"
                            + "9: Add random vegetable.\n\n"
                            + "(You can enter numbers together \"example: 452836\")\n"
                            + ">> "
                    );
                    choose = scanner.nextInt();
                    if (choose == 0) {
                        continue;
                    } else {
                        List<Integer> arraylistOfVegetables = new ArrayList<>();
                        while (choose != 0) {
                            arraylistOfVegetables.add(choose % 10);
                            choose /= 10;
                        }
                        for (int i = 0; i < arraylistOfVegetables.size(); i++) {
                            chooseFromAListOfVegetables(arraylistOfVegetables.get(i));
                        }
                        System.out.println("You added ingredients to the salad!");
                        displayingAListOfSelectedVegetables();
                    }
                }
                if (choose == 2) {
                    System.out.print("Enter the number of vegetables: ");
                    choose = scanner.nextInt();
                    for (int i = 0; i < choose; i++) {
                        chooseFromAListOfVegetables(9);
                    }
                    displayingAListOfSelectedVegetables();
                }
                if (choose == 3) {
                    for (int i = 0; i < 8; i++) {
                        chooseFromAListOfVegetables(i + 1);
                    }
                    displayingAListOfSelectedVegetables();
                }
                if (choose == 4) {
                    System.out.print("Choose the name of the salad: ");
                    String nameSalad = scanner.next();
                    Salad.setSaladName(nameSalad);
                }
                if (choose == 5) {
                    WriteToTheFile file = new WriteToTheFile(vegetables);
                }
                if (choose == 6) {

                }
                else {
                    System.out.println("No such option!!!");
                }
            }catch (InputMismatchException error) {
                System.out.println("Error: you didn't enter a number");

            }

        }
    }

    void chooseFromAListOfVegetables(int vegetableSerialNumber) {
        if (vegetableSerialNumber == 1) {
            vegetables.add(new Broccoli());
        }
        if (vegetableSerialNumber == 2) {
            vegetables.add(new Cabbage());
        }
        if (vegetableSerialNumber == 3) {
            vegetables.add(new Carrot());
        }
        if (vegetableSerialNumber == 4) {
            vegetables.add(new Mushroom());
        }
        if (vegetableSerialNumber == 5) {
            vegetables.add(new Onion());
        }
        if (vegetableSerialNumber == 6) {
            vegetables.add(new Potato());
        }
        if (vegetableSerialNumber == 7) {
            vegetables.add(new Tomato());
        }
        if (vegetableSerialNumber == 8) {
            vegetables.add(new Cucumber());
        }
        if (vegetableSerialNumber == 9) {
            chooseFromAListOfVegetables((int) (Math.random() * 9 - 1));
        } else {
        }
    }

    void displayingAListOfSelectedVegetables() {
        for (int i = 0; i < vegetables.size(); i++) {
            System.out.println("* " + vegetables.get(i).getType());
        }
    }

    void fencing() {
        System.out.print("\\");
        for (int i = 0; i < 20; i++) {
            System.out.print("*");
        }
        System.out.print("\\\n");
    }
}

