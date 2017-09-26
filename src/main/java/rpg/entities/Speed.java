package rpg.entities;

import java.io.Serializable;

/**
 * Created by rivero on 26/09/2017.
 */
public class Speed implements Serializable {

    private static final Long serialVersionUID = 1L;

    private int base;
    private int armor;
    private int object;
    private int misc;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getObject() {
        return object;
    }

    public void setObject(int object) {
        this.object = object;
    }

    public int getMisc() {
        return misc;
    }

    public void setMisc(int misc) {
        this.misc = misc;
    }
}
