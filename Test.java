import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Food f1 = new Food("Dynazzy", "Cleaner - Lime Away", 78.25, 770.09, 18.23, 10.04, 7.74, 6.3);
        Food f2 = new Food("Aivee", "Shiratamako - Rice Flour", 492.31, 490.32, 16.48, 19.15, 23.68, 3.34);
        Food f3 = new Food("Camimbo", "Soup Campbells Mushroom", 427.68, 578.32, 9.02, 8.88, 19.25, 24.91);
        Food f4 = new Food("Vinder", "Tart Shells - Barquettes, Savory", 73.54, 495.52, 6.62, 21.45, 13.24, 18.82);
        Food f5 = new Food("Thoughbeat", "Lamb - Sausage Casings", 552.21, 1448.35, 3.31, 9.06, 18.95, 21.31);
        Food f6 = new Food("Skaboo", "Plasticspoonblack", 880.37, 849.41, 13.29, 22.78, 2.31, 22.23);
        Drink d1 = new Drink("Topicblab", "Coffee Guatemala Dark", 824.7, 563.19, 1.39, 14.41, 24.72, 13.01);
        Food f7 = new Food("Ailane", "Goat Leg", 57.3, 829.47, 4.04, 24.75, 14.02, 22.18);
        Drink d2 = new Drink("Zoomzone", "Wine - Kwv Chenin Blanc South", 659.8, 726.16, 14.5, 16.52, 21.58, 15.95);
        Food f8 = new Food("Edgewire", "Bread - White Baguette", 758.41, 312.07, 18.66, 6.48, 11.99, 4.16);
        Food f9 = new Food("Janyx", "Soup - Beef Conomme, Dry", 377.33, 1412.19, 7.4, 19.07, 2.0, 13.58);
        Food f10 = new Food("Gigaclub", "Bread Base - Toscano", 570.76, 1364.35, 19.75, 23.34, 14.0, 22.06);

        List<Nutriment>nutriments1 = new ArrayList<>();
        List<Nutriment>nutriments2 = new ArrayList<>();

        nutriments1.add(f1);
        nutriments1.add(f2);
        nutriments1.add(f3);
        nutriments1.add(f4);
        nutriments1.add(f5);
        nutriments1.add(d1);

        nutriments2.add(f6);
        nutriments2.add(f7);
        nutriments2.add(f8);
        nutriments2.add(f9);
        nutriments2.add(f10);
        nutriments2.add(d2);

        Meal m1 = new Meal(nutriments1, "Beans");
        Meal m2 = new Meal(nutriments2, "Peas");
        Meal m3 = new Meal(nutriments2, "Beans");

        //System.out.println(m1.getProteins());

        Meals a = new Meals();
        a.add(m1);
        a.add(m2);
        a.add(m3);

        Fridge f = new Fridge();
        f.add(f1);
        f.add(f2);
        f.add(f3);
        f.add(f4);
        f.add(f5);
        f.add(f6);
        f.add(f7);
        f.add(f8);
        f.add(f9);
        f.add(f10);
        f.add(d1);
        f.add(d2);

        f.remove(f1);
        f.remove(f2,100.55);
        System.out.println(f);
        a.remove(m2);
        System.out.println(a.search("Beans"));
        System.out.println(a.search(nutriments2));
        System.out.println(a.search(14542.41));
        System.out.println(a);

    }
}

