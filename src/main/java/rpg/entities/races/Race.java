package rpg.entities.races;

/**
 * Created by rivero on 26/09/2017.
 */
public enum Race {

    DRAGONBORN("dragonborn"), DWARF("dwarf"), ELADRIN("eladrin"), ELF("elf"),
    HALF_ELF("half-elf"), HALFLING("halfling"), HUMAN("human"), TIEFLING("tiefilng");

    private String type;

    Race(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
