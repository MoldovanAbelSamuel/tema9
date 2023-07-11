package Tema9package.Exercises1;

public class MainExercises1 {
    public static void main(String[] args) {
        Cosmetics parfum = new Cosmetics(499.99, "Invinctus", "men's parfume", 100, "Blue" , 200);
        Electronics TV = new Electronics(3499.99, "Samsung", "4k", 5, "139", "120", "70", "15");
        Fridge fridge = new Fridge(2500, "Beko", "double side", 15, "70", "70", "200", "50", 2);

        System.out.println("Exercises 1: \n");
        System.out.println("Only this day we have a promotion to the parfume " + parfum.getName() + ", at only " +
                parfum.getPrice() + " Ron! This parfume it's a " + parfum.getDescription() + ", model " + parfum.getColor()
                + ", " + parfum.getWeight() + " ml! Hurry up, we have only " + parfum.getQuantity() + " pieces in stock!\n" );
        System.out.println("We have a great deal for you at " + TV.getName() + " TV, " + TV.getDescription() +
                " with the diagonal of " + TV.getLength() + " at only " + TV.getPrice() + "RON! Specification: " +
                TV.getWidth() + " width, " + TV.getHeight() + " height and " + TV.getWeight() +
                " kg's. Hurry up, we have only " + TV.getQuantity() + " pieces in stock! \n");
        System.out.println("This day we have an offer for you at fridge " + fridge.getName() + " at only " + fridge.getPrice() +
                "RON, model " + fridge.getDescription() + ", with the dimensions (length, width, height, weidth): " + fridge.getLength() +
                " cm , " + fridge.getWidth() + " cm , " + fridge.getHeight() + " cm , " + fridge.getWeight() + " kg. For this type of fridge, the minimum temperature is: " +
                fridge.getTemperature() + " celsisus degrees. We have left in stock " + fridge.getQuantity() + " pieces!");
    }
}
