package Task1_3.SweetGift;

public class Lollipops extends Sweet {

    private String color;

    public Lollipops(String name, Double weight, Double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public Lollipops(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Леденцы: " + super.toString() + ", Цвет: " + color;
    }
}
