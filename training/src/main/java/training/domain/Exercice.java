package training.domain;

public class Exercice {
    private String ref;
    private int nbRepets;

    public Exercice( String ref, int nbRepets) {
        this.ref = ref;
        this.nbRepets = nbRepets;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getNbRepets() {
        return nbRepets;
    }

    public void setNbRepets(int nbRepets) {
        this.nbRepets = nbRepets;
    }
}
