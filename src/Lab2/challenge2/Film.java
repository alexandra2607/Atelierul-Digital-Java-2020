package Lab2.challenge2;

import java.util.ArrayList;
import java.util.List;

public class Film {
    public Integer anAparitie ;
    public String name;
    public List<Actor> actori = new ArrayList<Actor>();

    public Film(Integer anAparitie, String name, List<Actor> actori) {
        this.anAparitie = anAparitie;
        this.name = name;
        this.actori = actori;
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(Integer anAparitie) {
        this.anAparitie = anAparitie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Actor> getActori() {
        return actori;
    }

    public void setActori(List<Actor> actori) {
        this.actori = actori;
    }
}
