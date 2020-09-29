package animalKingdom;

public class Fish extends AbstractAnimal {

    private static int maxId = 0;

    private int id;
    private String name;
    private int year;

    public String getMove(){
        return "Swim";
    }
    public String getBreath(){
        return "Gills";
    }
    public String getReproduce(){
        return "Eggs";
    }
}