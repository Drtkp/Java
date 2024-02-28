package Task1_3.SweetGift;

public abstract class Sweet {

     private String name;
     private Double weight;
     private Double price;

    public Sweet(String name, Double weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getPrice() {
        return price;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Sweet() {
    }

    @Override
    public String toString() {
        return "Название:" + name + ", Цена: " + price + " Вес: " + weight;
    }
}
