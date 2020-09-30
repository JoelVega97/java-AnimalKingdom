package animalKingdom;

abstract class AbstractAnimal {
    protected static int maxId = 0;

    protected int id;
    protected String name;
    protected int year;

    public AbstractAnimal( String name, int year){
        maxId++;
        id = maxId;

        this.name = name;
        this.year = year;
    }

    //methods 

    public int getYear(){
        return year;
    }
    public String getName(){
        return name;
    }
    public void consume(){}

    //interface
    abstract String getMove();
    abstract String getBreath();
    abstract String getReproduce();

    @Override 
    public String toString(){
        return " Name: " + name + " Year: " + year;
    }
}
