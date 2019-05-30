package animal;

public abstract class AbstractAnimal
{
    int maxId = 0;
    protected int food;
    protected int id;
    protected String name;
    protected int year;

    public AbstractAnimal(String name, int year, int food)
    {
        this.id = maxId;
        maxId++;

        this.name = name;
        this.year = year;
        this.food = food;
    }

    public AbstractAnimal()
    {
        food = 1;
    }

    public abstract String getName();
    public abstract String getMove();
    public abstract String getBreath();
    public abstract String getReproduce();

    public void eatFood()
    {
        food--;
    }

    public int getYear()
    {
        return year;
    }



}
