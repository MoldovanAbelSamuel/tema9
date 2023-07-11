package Tema9package.Exercises1;

public class Fridge extends Electronics {

    private double temperature;

    public Fridge(double price, String name, String description, int quantity, String stringLenth, String stringWidth, String stringHeight, String stringWeigth, double temperature) {
        super(price, name, description, quantity, stringLenth, stringWidth, stringHeight, stringWeigth);
        this.temperature = temperature;
    }

    public double getTemperature() {

        return temperature;
    }

}
