package rpg.entities;

import java.io.Serializable;

/**
 * Created by rivero on 26/09/2017.
 */
public class Defense implements Serializable{

    private static final Long serialVersionUID = 1L;

    private int characteristic;
    private int characterClass;
    private int feature;
    private int improve;
    private int misc1;
    private int misc2;

    public int getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(int characteristic) {
        this.characteristic = characteristic;
    }

    public int getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(int characterClass) {
        this.characterClass = characterClass;
    }

    public int getFeature() {
        return feature;
    }

    public void setFeature(int feature) {
        this.feature = feature;
    }

    public int getImprove() {
        return improve;
    }

    public void setImprove(int improve) {
        this.improve = improve;
    }

    public int getMisc1() {
        return misc1;
    }

    public void setMisc1(int misc1) {
        this.misc1 = misc1;
    }

    public int getMisc2() {
        return misc2;
    }

    public void setMisc2(int misc2) {
        this.misc2 = misc2;
    }
}
