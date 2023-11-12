public class Task16 {
    public static void main(String[] args) {

        equation("8-x=2");

    }

    public static void equation(String value) {
        String[] arr = value.split("");

        if (arr[1].equals("+")) {

            if (arr[0].equals("x")) {
                System.out.println(Integer.parseInt(arr[4]) - Integer.parseInt(arr[2]));
            } else if (arr[2].equals("x")) {
                System.out.println(Integer.parseInt(arr[4]) - Integer.parseInt(arr[0]));
            } else if (arr[4].equals("x")) {
                System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]));
            }
        } else if (arr[1].equals("-")) {

            if (arr[0].equals("x")) {
                System.out.println(Integer.parseInt(arr[4]) + Integer.parseInt(arr[2]));
            } else if (arr[2].equals("x")) {
                System.out.println(Integer.parseInt(arr[0]) - Integer.parseInt(arr[4]));
            } else if (arr[4].equals("x")) {
                System.out.println(Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]));
            }

        }

    }

}