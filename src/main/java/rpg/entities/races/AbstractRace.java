package rpg.entities.races;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import rpg.entities.Speed;

import java.io.Serializable;

/**
 * Created by rivero on 26/09/2017.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Dragonborn.class, name = "dragonborn"),
        @JsonSubTypes.Type(value = Dwarf.class, name = "dwarf"),
        @JsonSubTypes.Type(value = Eladrin.class, name = "eladrin"),
        @JsonSubTypes.Type(value = Elf.class, name = "elf"),
        @JsonSubTypes.Type(value = HalfElf.class, name = "half-elf"),
        @JsonSubTypes.Type(value = Halfling.class, name = "halfling"),
        @JsonSubTypes.Type(value = Human.class, name = "human"),
        @JsonSubTypes.Type(value = Tiefling.class, name = "tiefling")
})
public abstract class AbstractRace implements Serializable{

    private static final Long serialVersionUID = 1L;

    private Speed speed;
    private Race type;

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public Race getType() {
        return type;
    }

    public void setType(Race type) {
        this.type = type;
    }
}
