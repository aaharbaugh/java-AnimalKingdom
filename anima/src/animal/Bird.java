package animal;

public class Bird extends AbstractAnimal
{

    public Bird(String name, int year, int food)
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
        return "fly";
    }

    @Override
    public String getBreath()
    {
        return "lungs";
    }

    @Override
    public String getReproduce()
    {
        return "eggs";
    }

    @Override
    public String toString()
    {
        return "\n[Bird | " + getName() + " | " + year + " |  " + getMove() + " | " + getBreath() + "| " + getReproduce() + "]";
    }
}