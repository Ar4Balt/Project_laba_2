package by.Ar4Balt.tunnikov.project_laba_2.vegetables;

public class Vegetables {
    private String Type;
    private double Calories;
    private int Grammes;

    public Vegetables(){}
    public Vegetables(String type, double calories, int grammes) {
        Type = type;
        Calories = calories;
        Grammes = grammes;
    }
    public Vegetables(Vegetables filling1, Vegetables filling2, String type){
        this.Type = type;
        this.Calories = filling1.Calories + filling2.Calories + 19.7f;
    }
    public Vegetables(String Name){
    }

    public String getType() {
        return Type;
    }
    public void setType(String type) {
        Type = type;
    }
    public double getCalories() {
        return Calories;
    }
    public void setCalories(double calories) {
        Calories = calories;
    }
    public double getGrammes() {
        return Grammes;
    }
    public void setGrammes(int grammes) {
        Grammes = grammes;
    }

    @Override
    public String toString() {
        return "\nType: " + Type + "\n"
                + "Calories: " + Calories + "\n"
                + "Grammes: " + Grammes + ";\n";
    }

}
