package Task1_3.SweetGift;

public class Candy extends Sweet {

    private String kind;

    public Candy(String name, Double weight, Double price, String kind) {
        super(name, weight, price);
        this.kind = kind;
    }

    public Candy(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Конфеты: " + super.toString() + ", Разновидность: " + kind;
    }
}
