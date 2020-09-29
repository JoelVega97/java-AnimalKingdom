package animalKingdom;

public class Mammals extends AbstractAnimal {

    private static int maxId = 0;

    private int id;
    private String name;
    private int year;

    public String getMove(){
        return "Walk";
    }
    
    public String getBreath(){
        return "Lungs";
    }

    public String getReproduce(){
        return "Live Births";
    }

}
