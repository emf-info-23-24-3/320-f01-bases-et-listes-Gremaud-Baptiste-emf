package app;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        ArrayList<Personne> personnes = new ArrayList<>();

        personnes.add(new Personne("Gremaud", "Baptiste", "Estavannens", "Chemin des Rosys", "1665"));
        personnes.add(new Personne("Gremaud", "Valentin", "Le Pâquier", "Les albergeux", "1661"));
        personnes.add(new Personne("Bardy", "Maxime", "Courtepin", "Route des hautes genièvres", "1730"));

        for (Personne personne : personnes) {
            System.out.println(personne);
        }
    }

}
