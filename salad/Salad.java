package by.Ar4Balt.tunnikov.project_laba_2.salad;

import by.Ar4Balt.tunnikov.project_laba_2.vegetables.*;

import java.util.ArrayList;

public class Salad {
    private static String SaladName;
    private double SaladCalories;
    private ArrayList<Vegetables> IngredientsForSalad;

    public Salad() {
        SaladName = "No name";
        IngredientsForSalad = null;
    }

    public Salad(String saladName, double saladCalories) {
        SaladName = saladName;
        SaladCalories = saladCalories;
    }

    public Salad(String saladName) {
        SaladName = saladName;
    }

    public Salad(ArrayList<Vegetables> ingredientsForSalad) {
        SaladName = "Salad for pregnant)";
        IngredientsForSalad = ingredientsForSalad;
        SaladCalories = caloriAccount(IngredientsForSalad);
    }

    public String getSaladName() {
        return SaladName;
    }

    public static void setSaladName(String saladName) {
        SaladName = saladName;
    }

    public double getSaladCalories() {
        return SaladCalories;
    }

    public void setSaladCalories(double saladCalories) {
        SaladCalories = saladCalories;
    }

    public ArrayList<Vegetables> getIngredientsForSalad() {
        return IngredientsForSalad;
    }

    public void setIngredientsForSalad(ArrayList<Vegetables> ingredientsForSalad) {
        IngredientsForSalad = ingredientsForSalad;
    }

    double caloriAccount(ArrayList<Vegetables> ingredientsForSalad) {
        double allCalories = 0.0;
        for (int i = 0; i < ingredientsForSalad.size(); i++) {
            allCalories += ingredientsForSalad.get(i).getCalories();
        }
        return allCalories;
    }

    @Override
    public String toString() {
        return "Salad: \n" +
                "IngredientsForSalad: \n" + IngredientsForSalad + '\n' +
                "SaladName = " + SaladName + '\n' +
                "SaladCalories = " + SaladCalories;
    }
}
