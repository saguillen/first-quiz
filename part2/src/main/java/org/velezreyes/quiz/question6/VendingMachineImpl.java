package org.velezreyes.quiz.question6;

import org.velezreyes.quiz.question6.VendingMachine;
import org.velezreyes.quiz.question6.Drink;

public class VendingMachineImpl implements VendingMachine {

  private int currentMoney;

  public VendingMachineImpl() {
    currentMoney = 0;
  }

  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }

  public void insertQuarter() {

    currentMoney += 25;

  }

  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    if (name.equals("ScottCola")) {
      if (currentMoney >= 75) {
        currentMoney = 0;
        Drink drink = new DrinkImpl("ScottCola", true);
        return drink;
      }
      else {
        throw new NotEnoughMoneyException();
      }
    }
    
    else if (name.equals("KarenTea")) {
      if (currentMoney >= 100) {
        currentMoney = 0;
        Drink drink = new DrinkImpl("KarenTea", false);
        return drink;
      }
      else {
        throw new NotEnoughMoneyException();
      }
    }
    else {
      throw new UnknownDrinkException();
    }
  }

  private class DrinkImpl implements Drink {
    private String name;
    private boolean isFizzy;

    public DrinkImpl(String name, boolean isFizzy) {
      this.name = name;
      this.isFizzy = isFizzy;
    }

    public String getName() {
      return name;
    }

    public boolean isFizzy() {
      return isFizzy;
    }
  }

}
