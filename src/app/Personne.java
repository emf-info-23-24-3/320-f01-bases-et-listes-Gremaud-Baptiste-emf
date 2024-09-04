package app;

public class Personne {
    private String nom;
    private String prenom;
    private String localite;
    private String rue;
    private String npa;

    public Personne(String nom, String prenom, String localite, String rue, String npa) {
        this.nom = nom;
        this.prenom = prenom;
        this.localite = localite;
        this.rue = rue;
        this.npa = npa;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getLocalite() {
        return localite;
    }

    public String getRue() {
        return rue;
    }

    public String getNpa() {
        return npa;
    }

    @Override
    public String toString() {
        return nom+" "+prenom+" "+ localite+" "+rue+" "+npa;
    }
}
