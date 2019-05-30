package animal;

public class Mammal extends AbstractAnimal
{
    public String name;

    public Mammal(String name, int year, int food)
    {
        this.name = name;
        this.year = year;
        this.food = food;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String getMove()
    {
        return "walk";
    }

    @Override
    public String getBreath()
    {
        return "lungs";
    }

    @Override
    public String getReproduce()
    {
        return "live birth";
    }
}