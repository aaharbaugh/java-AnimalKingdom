package animal;

public class Mammal extends AbstractAnimal
{
    public String name;

    public Mammal(String name, int food)
    {
        super(food);
        this.name = name;
    }

    @Override
    public void String getName()
    {
        return name;
    }

    @Override
    public void String getMove()
    {
        return "walk";
    }

    @Override
    public void String getBreath()
    {
        return "lungs";
    }

    @Override
    public void String getReproduce()
    {
        return "live birth";
    }
}