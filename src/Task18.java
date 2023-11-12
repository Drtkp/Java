import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctAnswer = "Заархивированный вирус";
        boolean clue = false;
        System.out.println("Загадка: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        int i = 0;
        String answer = null;

        while (i!=3) {
            answer = scanner.nextLine();
            if (answer.equals("Подсказка") && !clue && i==0) {
                clue = true;
                System.out.println("Он страшный...");
                answer = scanner.nextLine();
                if (answer.equals(correctAnswer)) {
                    System.out.println("Правильно!");
                } else {
                    System.out.println("Обидно, приходи в другой раз");
                    break;
                }

            } else if (answer.equals("Подсказка")) {
                System.out.println("Подсказка уже недоступна");
            }

            if (answer.equals(correctAnswer)) {
                System.out.println("Правильно!");
                break;
            } else if (!answer.equals("Подсказка") && i!=2){
                System.out.println("Подумай еще!");
                i++;
            } else if (i>=2 && !answer.equals("Подсказка")){
                System.out.println("Обидно, приходи в другой раз");
                break;
            }

        }

    }
}
