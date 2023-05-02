package meals;

import burgers.ChickenBurger;
import drinks.Pepsi;

public class NonVegMealBuilder implements MealBuilder {
    Meal meal = new Meal();
    @Override
    public void buildBurger() {
        meal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new Pepsi());

    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
