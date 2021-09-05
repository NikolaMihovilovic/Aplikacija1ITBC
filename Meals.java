import java.util.ArrayList;
import java.util.List;

public class Meals {
    List<Meal> meals;

    public Meals(List<Meal> meals) {
        this.meals = meals;
    }

    public Meals() {
        this.meals = new ArrayList<>();
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void add (Meal m){
        if (!meals.contains(m)){
            meals.add(m);
        }
    }

    public void remove (Meal m){
        for (Meal el: meals){
            if (el.equals(m)){
                meals.remove(m);
                break;
            }
        }
    }

    public List<Meal> search (String s){
        List<Meal> list = new ArrayList<>();
        for (Meal el: meals){
            if (el.name.contains(s)){
                list.add(el);
            }
        }
        return list;
    }
    public List<Meal> search (List<Nutriment> nutriments){
        List<Meal> list = new ArrayList<>();
        for (Meal el: meals){
            if (el.nutriments == nutriments){
                list.add(el);
            }
        }
        return list;
    }
    public List<Meal> search(double kcal) {
        List<Meal> list = new ArrayList<>();
        for (Meal el : meals) {
            if (el.getKcal() < kcal) {
                list.add(el);
            }
        }
        return list;
    }

    @Override
    public String toString() {
        String rez = "";
        for (Meal el : meals) {
            rez +=  "[" + el.id + "]" +  " | Name: " + el.name + "\n";
        }
        return rez;
    }
}

