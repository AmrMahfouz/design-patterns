package builder;

public class Main {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal chickenMeal = mealBuilder.prepareChickenMeal();
        System.out.println("Chicken Meal :");
        chickenMeal.showItems();
        System.out.println("Total Cost : " + chickenMeal.getCost());
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal :");
        vegMeal.showItems();
        System.out.println("Total Cost : " + vegMeal.getCost());
    }

}
