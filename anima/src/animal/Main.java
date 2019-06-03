package animal;

import java.util.*;

public class Main
{
    public static void printAnimal(ArrayList<AbstractAnimal> animals, CheckAnimal tester)
    { 
        for (AbstractAnimal a : animals)
        {
            if(tester.test(a))
            {
                System.out.print(a.toString());
            }
        }
    }

    public static ArrayList<AbstractAnimal> sortAnimal(ArrayList<AbstractAnimal> animals, CheckAnimal tester)
    { 
        ArrayList<AbstractAnimal> sortedList = new ArrayList<AbstractAnimal>();

        for (AbstractAnimal a : animals)
        {
            if(tester.test(a))
            {
                sortedList.add(a);
            }
        }

        return sortedList;
    }

    public static void main(String[] args)
    {
        Mammal panda = new Mammal("Panda", 1869, 3);
        Mammal zebra = new Mammal("Zebra", 1778, 2);
        Mammal koala = new Mammal("Koala", 1816, 2);
        Mammal sloth = new Mammal("Sloth", 1804, 2);
        Mammal armadillo = new Mammal("Armadillo", 1758, 2);
        Mammal raccoon = new Mammal("Raccoon", 1758, 2);
        Mammal bigfoot = new Mammal("Bigfoot", 2021, 2);

        Bird pigeon = new Bird("Pigeon", 1837, 2);
        Bird peacock = new Bird("Peacock", 1821, 2);
        Bird toucan = new Bird("Toucan", 1758, 2);
        Bird parrot = new Bird("Parrot", 1824, 2);
        Bird swan = new Bird("Swan", 1758, 2);

        Fish salmon = new Fish("Salmon", 1758, 1);
        Fish catfish = new Fish("Catfish", 1758, 1);
        Fish perch = new Fish("Perch", 1758, 1);

        ArrayList<AbstractAnimal> fullList = new ArrayList<AbstractAnimal>();
        fullList.add(panda);
        fullList.add(zebra);
        fullList.add(koala);
        fullList.add(sloth);
        fullList.add(armadillo);
        fullList.add(raccoon);
        fullList.add(bigfoot);
        fullList.add(pigeon);
        fullList.add(peacock);
        fullList.add(toucan);
        fullList.add(parrot);
        fullList.add(swan);
        fullList.add(salmon);
        fullList.add(catfish);
        fullList.add(perch);

        System.out.println("\n*** The Full List ***\n");
        System.out.println(fullList.toString());

        System.out.println("\n*** Descending Order of Year Named ***\n");
        fullList.sort((v1, v2) -> v2.getYear() - v1.getYear());
        System.out.println(fullList.toString());

        System.out.println("\n*** Alphabetical Order by Name ***\n");
        fullList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        System.out.println(fullList.toString());

        System.out.println("\n*** Lung Breathing Animals ***");
        printAnimal(fullList, v -> (v.getBreath().equals("lungs")));

        System.out.println("\n\n*** Lung Breathing Animals Born in 1758 ***");
        printAnimal(fullList, v -> (v.getBreath().equals("lungs")) && (v.getYear() == 1758));

        System.out.println("\n\n*** Lung Breathing Animals Born That Lay Eggs ***");
        printAnimal(fullList, v -> (v.getReproduce().equals("eggs")) && (v.getBreath().equals("lungs")));
        
        
        System.out.println("\n\n*** Alphabetical Order of Animals Born in 1758  ***");
        ArrayList<AbstractAnimal> yearList = new ArrayList<AbstractAnimal>();
        yearList = sortAnimal(fullList, v -> (v.getYear() == 1758));
        yearList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        System.out.println(yearList.toString());

        System.out.println("\n\n*** Alphabetical Order of Mammals***");
        ArrayList<AbstractAnimal> typeList = new ArrayList<AbstractAnimal>();
        typeList = sortAnimal(fullList, v -> (v instanceof Mammal));
        typeList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        System.out.println(typeList.toString());
    }
}