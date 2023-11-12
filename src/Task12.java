public class Task12 {

    public static void main(String[] args) {
        app("I like Java!!!");
    }

    public static void app(String x){

        if (x.contains("Java") && x.startsWith("I like") && x.endsWith("!!!")){

            System.out.println(x.toUpperCase());
            System.out.println(x.replace("a","o").substring(7,11));

        }
    }

}
