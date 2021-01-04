package Lab2.challenge2;

import java.util.ArrayList;
import java.util.List;

public class Actor {
    public String nume;
    public Integer varsta;
    public List<Premiu> premii = new ArrayList<Premiu>();

    public Actor(String nume, Integer varsta, List<Premiu> premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public List<Premiu> getPremii() {
        return premii;
    }

    public void setPremii(List<Premiu> premii) {
        this.premii = premii;
    }
}
