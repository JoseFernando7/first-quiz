package org.velezreyes.quiz.question6;

public class DrinkImpl implements Drink
{
    private String name;

    @Override
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public boolean isFizzy()
    {
        return getName().equals("ScottCola");
    }

    public double getPrice()
    {
        if (getName().equals("ScottCola")) return 0.75;
        else return 1.00;
    }
}
