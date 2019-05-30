package animal;

public class Fish extends AbstractAnimal
{
    public String name;

    public Fish(String name)
    {
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
}