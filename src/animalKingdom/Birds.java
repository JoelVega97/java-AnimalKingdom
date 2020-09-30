package animalKingdom;

public class Birds extends AbstractAnimal {


    public Birds(String name, int year){
        super(name, year);
    }

    
    //sets and gets
    public int getId(){
        return id;
    }
    public void setId(int id){
         this.id = id;
    }
    
    public String getName(){
        return name;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    //interface methods
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
