package meals;

import burgers.VegBurger;
import drinks.Coke;

public class VegMealBuilder implements MealBuilder {
    Meal meal = new Meal();
    @Override
    public void buildBurger() {
        meal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
