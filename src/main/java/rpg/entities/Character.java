package rpg.entities;


import rpg.entities.races.AbstractRace;

public class Character extends AbstractRace{

    private String name;
    private int level;
    private int age;
    private float height;
    private float weight;
    private int strength;
    private int constitution;
    private int dextery;
    private int intelligence;
    private int wisdom;
    private int charisma;

    private AbstractRace race;
    private Defense ac;
    private Defense fortitude;
    private Defense reflex;
    private Defense will;


}
