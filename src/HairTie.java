public class HairTie {
    private String color;
    private int diameter;
    private double price;
    private boolean isStretchy;
    final double pi = 3.1415;

    public HairTie(String color, int diameter, double price, boolean isStretchy) {
        this.color = color;
        this.diameter = diameter;
        this.price = price;
        this.isStretchy = isStretchy;
    }

    public HairTie() {
        color = "pink";
        diameter = 1;
        price = 0.30;
        isStretchy = true;
    }

    // "getter" method that returns the color
    public String getColor() {
        return color;
    }


    // "setter" method that sets the color to a new value
    public void setColor(String newColor) {
        color = newColor;
    }

    // "getter" method that returns the diameter value
    public int getDiameter() {
        return diameter;
    }


    // "setter" method that sets the diameter value
    public void setDiameter(int newDiameter) {
        diameter = newDiameter;
    }

    // "getter" method that returns the price
    public double getPrice() {
        return price;
    }


    // "setter" method that sets the price to a new value
    public void setPrice(double newPrice) {
        price = newPrice;
    }

    // "getter" method that returns if stretchy
    public boolean getStretchy() {
        return isStretchy;
    }


    // "setter" method that sets if stretchy boolean to a new value
    public void setStretchy(boolean newStretchy) {
        isStretchy = newStretchy;
    }

    // method that calculates and returns the radius of the hair tie
    public double calculateRadius() {
        return (double) diameter/2;
    }

    // method that calculates and returns the circumference of the hair tie
    public double calculateCircumference() {
        return diameter*pi;
    }

    // method that prints Hair Tie info
    public void printHairTieInfo() {
        System.out.println("Color: " + color);
        System.out.println("Diameter: " + diameter);
        System.out.println("Price: " + price);
        System.out.println("Is it stretchy?: " + isStretchy);
    }
}
