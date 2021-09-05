import java.util.List;
import java.util.UUID;

public class Meal implements Energy {
    UUID id;
    List<Nutriment> nutriments;
    String name;

    public Meal(UUID id, List<Nutriment> nutriments, String name) {
        id = UUID.randomUUID();
        this.nutriments = nutriments;
        this.name = name;
    }

    public Meal(List<Nutriment> nutriments, String name) {
    }

    public UUID getId() {
        return id;
    }

    public List<Nutriment> getNutriments() {
        return nutriments;
    }

    public String getName() {
        return name;
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
                nutriments.remove(n);
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

    @Override
    public double getKcal() {
        double sum = 0;
        for (Nutriment el : nutriments) {
            sum += getKcal();
        }
        return sum;
    }

    public double getProteins() {
        double sum = 0;
        for (Nutriment el : nutriments) {
            sum += el.getTotalProteins();
        }
        return sum;
    }

    public double getCarbohydrates() {
        double sum = 0;
        for (Nutriment el : nutriments) {
            sum += el.getTotalCarbohydrates();
        }
        return sum;
    }

    public double getFats() {
        double sum = 0;
        for (Nutriment el : nutriments) {
            sum += el.getTotalFats();
        }
        return sum;
    }
    public double getFiber() {
        double sum = 0;
        for (Nutriment el : nutriments) {
            sum += el.getTotalFiber();
        }
        return sum;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Meal x = (Meal) obj;
        if (id.equals(x.id)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String rez = "";
        rez += id + " | Name: " + name ;
        return rez;
    }
}







