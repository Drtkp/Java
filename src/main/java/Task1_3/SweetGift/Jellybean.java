package Task1_3.SweetGift;

public class Jellybean extends Sweet {

    private String taste;

    public Jellybean(String name, Double weight, Double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public Jellybean(String taste) {
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Жевательные конфеты: " + super.toString() + ", Вкус: " + taste;
    }
}
