package animalKingdom;

import java.util.*; 

public class Main{

    private static List<AbstractAnimal> filterAnimal(List<AbstractAnimal> animals, CheckAnimal tester){
        List<AbstractAnimal> tempList = new ArrayList<>();
        for (AbstractAnimal a: animals){
            if(tester.test(a)){
                tempList.add(a);
            }
        }
        return tempList;
    }

    public static void main(String[] args){
        System.out.println("\nHey everyone");
        System.out.println("\n***Mammals***\n");

        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armor = new Mammals("Armadillo", 1758);
        Mammals racc = new Mammals("Raccoon", 1758);
        Mammals bf = new Mammals("Bigfoot", 2021);

        Birds pgn = new Birds("Pigeon", 1837);
        Birds pck = new Birds("Peacock", 1821);
        Birds tuc = new Birds("Toucan", 1758);
        Birds par = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        Fish slmn = new Fish("Salmon", 1758);
        Fish ctf = new Fish("Catfish", 1817);
        Fish prch = new Fish("Perch", 1758);

        List<AbstractAnimal> Mammals = new ArrayList<>();
        Mammals.add(panda);
        Mammals.add(zebra);
        Mammals.add(koala);
        Mammals.add(sloth);
        Mammals.add(armor);
        Mammals.add(racc);
        Mammals.add(bf);
        
        System.out.println(Mammals);
        
        List<AbstractAnimal> Birds = new ArrayList<>();
        Birds.add(pgn);
        Birds.add(pck);
        Birds.add(tuc);
        Birds.add(par);
        Birds.add(swan);

        System.out.println("\n***Birds***\n");
        System.out.println(Birds);

        List<AbstractAnimal> Fish = new ArrayList<>();
        Fish.add(slmn);
        Fish.add(ctf);
        Fish.add(prch);

        System.out.println("\n***Fish***\n");
        System.out.println(Fish);

        List<AbstractAnimal> AllList = new ArrayList<>();

        AllList.add(panda);
        AllList.add(zebra);
        AllList.add(koala);
        AllList.add(sloth);
        AllList.add(armor);
        AllList.add(racc);
        AllList.add(bf);
        AllList.add(pgn);
        AllList.add(pck);
        AllList.add(tuc);
        AllList.add(par);
        AllList.add(swan);
        AllList.add(slmn);
        AllList.add(ctf);
        AllList.add(prch);

        System.out.println("\n ***All List*** \n");
        System.out.println(AllList);

        System.out.println("\n***Reverse Year***\n");

        AllList.sort((y1, y2) -> y2.getYear()-y1.getYear());
        System.out.println(AllList);

        System.out.println("\n***Alphabetical***\n");

        AllList.sort((n1, n2) -> n1.getName().compareToIgnoreCase(n2.getName()));
        System.out.println(AllList);

        System.out.println("\n***Move Order***\n");

        AllList.sort((m1, m2) -> m1.getMove().compareToIgnoreCase(m2.getMove()));
        System.out.println(AllList);

        System.out.println("\n***Lungs***\n");

        List<AbstractAnimal> lungList = filterAnimal(AllList, a -> a.getBreath() == "Lungs");
        lungList.forEach(l -> System.out.println(l.getName() + " " + l.getReproduce() + " " + l.getBreath() + " " + l.getYear()));

        System.out.println("\n***Lungs and 1758***\n");

        List<AbstractAnimal> thisList = filterAnimal(AllList, a -> (a.getBreath() == "Lungs" && a.getYear() == 1758));
        thisList.forEach(l -> System.out.println(l.getName() + " " + l.getReproduce() + " " + l.getBreath() + " " + l.getYear()));

        System.out.println("\n***Eggs and Lungs***\n");

        List<AbstractAnimal> eggsList = filterAnimal(AllList, a -> (a.getBreath() == "Lungs" && a.getReproduce() == "Eggs"));
        eggsList.forEach(l -> System.out.println(l.getName() + " " + l.getReproduce() + " " + l.getBreath() + " " + l.getYear()));

        System.out.println("\n***Alphabetically in 1758***\n");

        List<AbstractAnimal> alpha58 = filterAnimal(AllList, a -> a.getYear() == 1758);
        alpha58.sort((n1, n2) -> n1.getName().compareToIgnoreCase(n2.getName()));
        alpha58.forEach(l -> System.out.println(l.getName() + " " + l.getReproduce() + " " + l.getBreath() + " " + l.getYear()));
    }

}