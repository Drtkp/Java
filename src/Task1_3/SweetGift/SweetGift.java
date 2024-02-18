package Task1_3.SweetGift;

public class SweetGift {

    /**
     * @param args
     * @author Dmitrii Bulavko
     */

    public static void main(String[] args) {

        Double weight = 0.0;
        Double price = 0.0;

        Candy candy = new Candy("Ozera",15.3,200.10,"Шоколадные");
        Jellybean jellybean = new Jellybean("Mentos",5.5,55.0,"Мята");
        Lollipops lollipops = new Lollipops("Чупа-чупс",2.4,22.0,"Синий");
        Candy secCandy = new Candy("Ярче",100.1,135.3,"Шоколадные с начинкой");

        Sweet[] sweetGift = {candy,jellybean,lollipops,secCandy};

        for (Sweet sweet: sweetGift) {
            System.out.println(sweet.toString());
            price+=sweet.getPrice();
            weight+= sweet.getWeight();
        }

        System.out.printf("Общая стоимость подарка: %.1f, Общий вес подарка: %.1f" ,price, weight);

    }

}
