package director;

import meals.MealBuilder;

public class Director {

    MealBuilder mealBuilder;

    public void construct(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
        this.mealBuilder.buildBurger();
        this.mealBuilder.buildDrink();
    }
}
