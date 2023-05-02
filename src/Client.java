import director.Director;
import meals.Meal;
import meals.MealBuilder;
import meals.NonVegMealBuilder;
import meals.VegMealBuilder;

public class Client {
    public static void main(String[] args) {
        System.out.println("**Builder Pattern Demo **\n");

        Director director = new Director();

        MealBuilder vegMealBuilder = new VegMealBuilder();
        MealBuilder nonVegMealBuilder = new NonVegMealBuilder();

        // making a veggie meal
        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();
        vegMeal.showItems();

        // making a non-veggie meal
        director.construct(nonVegMealBuilder);
        Meal nonVegMeal = nonVegMealBuilder.getMeal();
        nonVegMeal.showItems();

    }
}