package model;

import java.util.ArrayList;
import java.util.List;

public class Cena {
    
    List<Mob> mobs;

    public Cena() {
        this.mobs = new ArrayList<>();
    }

    public List<Mob> getMobs() {
        return mobs;
    }

    public void setMobs(List<Mob> mobs) {
        this.mobs = mobs;
    }

    @Override
    public String toString() {
        return "Cena [mobs=" + mobs + "]";
    }
}
