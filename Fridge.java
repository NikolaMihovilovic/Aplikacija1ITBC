import java.util.ArrayList;
import java.util.List;

public class Fridge {
    List<Nutriment> nutriments;

    public Fridge() {
        this.nutriments = new ArrayList<>();
    }

    public void add(Nutriment n) {
        if (!nutriments.contains(n)) {
            nutriments.add(n);
        } else {
            for (Nutriment el : nutriments) {
                if (el == n) {
                    el.weight += n.weight;
                    break;
                }
            }
        }
    }

    public void remove(Nutriment n) {
        for (Nutriment el : nutriments) {
            if (el == n) {
                nutriments.remove(el);
                break;
            }
        }
    }
    public void remove(Nutriment n, double weight) {
        for (Nutriment el : nutriments) {
            if (el == n) {
                el.weight -= weight;
                break;
            }
        }
    }

    public List<Nutriment> getNutriments() {
        return nutriments;
    }

    @Override
    public String toString() {
        String rez = "";
        for (Nutriment el : nutriments){
            rez += el.toString();
        }
        return rez;
    }
}
