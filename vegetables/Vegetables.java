package by.Ar4Balt.tunnikov.project_laba_2.vegetables;

import java.util.Objects;

public class Vegetables {
    public String Name;
    protected double Calories;
    public String Type;

    public Vegetables(){}
    public Vegetables(String name, double calories, String type) {
        Name = name;
        Calories = calories;
        Type = type;
    }
    public Vegetables(Vegetables filling1, Vegetables filling2, String Name){
        this.Name = Name;
        this.Calories = filling1.Calories + filling2.Calories + 19.7f;
    }
    public Vegetables(String Name, double Calories){
        this.Name = Name;
        this.Calories = Calories;
    }
    public Vegetables(String Name){
    }
    public Vegetables(double Calories){
        this("Anything", Calories);
    }

    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public void setCalories(double Calories){
        this.Calories = Calories;
    }
    public double getCalories(){
        return Calories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vegetables)) return false;
        Vegetables food = (Vegetables) o;
        return Double.compare(food.getCalories(), getCalories()) == 0 && Objects.equals(getName(), food.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCalories());
    }

    public void consume(){
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "Food " + Type + " " + Name + " has been eating";
    }
}
