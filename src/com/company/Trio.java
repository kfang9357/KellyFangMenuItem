package com.company;

public class Trio {

    public class trio implements menuItem

    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public trio (String Sandwich, String Salad, String Drink)
    {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName()
    {
        return sandwich.getName() + “/” + salad.getName() + “/” + drink.getName() + ” trio”;
    }

    public double getPrice()
    {
        double priceSandwich = Sandwich.getPrice();
        double priceSalad = Salad.getPrice();
        double priceDrink = Drink.getPrice();

        if ((priceSandwich <= priceSalad) && (priceSandwich <= priceDrink))
        {
            return priceSalad + priceDrink;
        }
        else if ((priceSalad<=priceSandwich) && (priceSalad<=priceDrink))
    {
        return priceSandwich + priceDrink;
    }
        else if ((priceDrink<=priceSalad) && (priceDrink<=priceSandwich))
    {
        return priceSalad + priceSandwich;
    }
    }





}
