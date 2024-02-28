package Task1_5;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Words {

    private static final String path = "путь";

    public static void main(String[] args) throws IOException {

        ArrayList<String> strings = new ArrayList<>();

        HashMap <String,Integer> map = new HashMap<>();

        FileReader reader = new FileReader(path);
        Scanner scanner = new Scanner(reader);

        while (scanner.hasNextLine()) {
            String[] words = scanner.nextLine().split(" ");
            for (String word : words)
                strings.add(word);

        }

        scanner.close();

        Collections.sort(strings);

        for (String word: strings) {
             if (!map.containsKey(word)) {
                  map.put(word,1);
             } else {
                 map.put(word,map.get(word)+1);
             }
        }

        map.forEach((x, v) -> System.out.println("Слово " + x + " встречается " + v + " раз(а)"));

        Map.Entry<String, Integer> result = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();

        System.out.println("Слово " + result.getKey() + " встречается " + result.getValue() + " раз(а)");

    }

}