package animal;

public class Fish extends AbstractAnimal
{

    public Fish(String name, int year, int food)
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
        return "swim";
    }

    @Override
    public String getBreath()
    {
        return "gills";
    }

    @Override
    public String getReproduce()
    {
        return "eggs";
    }

    @Override
    public String toString()
    {
        return "\n[Fish | " + getName() + " | " + year + " |  " + getMove() + " | " + getBreath() + "| " + getReproduce() + "]";
    }
}