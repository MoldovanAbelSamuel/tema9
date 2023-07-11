package Tema9package.Exercises1;

public class Electronics extends Product{

    private double length;
    private double width;
    private double height;
    private double weight;


    public String getLength() {
        return String.valueOf(length);
    }

    public String getWidth() {
        return String.valueOf(width);
    }

    public String getHeight() {

        return String.valueOf(height);
    }

    public String getWeight() {

        return String.valueOf(weight);
    }


    public Electronics(double price, String name, String description, int quantity, String length, String width, String height, String weigth) {
        super(price, name, description, quantity);
        this.length = Double.parseDouble(length);
        this.width = Double.parseDouble(width);
        this.height = Double.parseDouble(height);
        this.weight = Double.parseDouble(weigth);
    }
}
