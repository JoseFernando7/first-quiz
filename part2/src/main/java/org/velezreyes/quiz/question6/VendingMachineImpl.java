package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine
{
  public double moneyInserted = 0;

  public static VendingMachine getInstance()
  {
    return new VendingMachineImpl();
  }

  @Override
  public void insertQuarter()
  {
    moneyInserted += 0.25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException
  {
    DrinkImpl drink = new DrinkImpl();
    drink.setName(name);

    double drinkPrice = drink.getPrice(); //To make "calculations" once

    if (moneyInserted == drinkPrice)
    {
      if (drink.getName().equals("ScottCola") || drink.getName().equals("KarenTea")) return drink;
      else throw new UnknownDrinkException();
    }
    else if (moneyInserted < drinkPrice)
    {
      throw new NotEnoughMoneyException();
    }
    else
    {
      throw new UnknownDrinkException(); //If the money inserted is higher of the prices means that no drink has been found
    }
  }
}
