package animalKingdom;

public class Birds extends AbstractAnimal {

    private static int maxId = 0;

    private int id;
    private String name;
    private int year;

    public String getMove(){
        return "Fly";
    }
    public String getBreath(){
        return "Lungs";
    }
    public String getReproduce(){
        return "Eggs";
    }
}
