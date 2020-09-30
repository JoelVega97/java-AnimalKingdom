package animalKingdom;

public class Fish extends AbstractAnimal {



    public Fish(String name, int year){
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
        return "Swim";
    }
    public String getBreath(){
        return "Gills";
    }
    public String getReproduce(){
        return "Eggs";
    }
    
    @Override 
    public String toString(){
        return " Name: " + name + " Year: " + year;
    }
}