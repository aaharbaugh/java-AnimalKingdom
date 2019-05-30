package animal;

public class Bird extends AbstractAnimal
{
    public String name;

    public Bird(String name, int food)
    {
        super(food);
        this.name = name;
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
}