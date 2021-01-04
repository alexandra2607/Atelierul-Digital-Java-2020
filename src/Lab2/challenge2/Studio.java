package Lab2.challenge2;

public class Studio {
    public String nume;
    public Film[] films = new Film[10];

    public Studio(String nume, Film[] films) {
        this.nume = nume;
        this.films = films;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Film[] getFilms() {
        return films;
    }

    public void setFilms(Film[] films) {
        this.films = films;
    }
}
