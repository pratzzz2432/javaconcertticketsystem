import java.io.File;
import java.util.*;

public class Part3_PopularMerchandise {

    public static void main(String[] args) {

        HashMap<String, Integer> itemCount = new HashMap<>();

        try {
            // reading the csv file
            Scanner scanner = new Scanner(new File("items.csv"));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] items = line.split(",");

                // counting each item
                for (String it : items) {
                    String item = it.trim();

                    if (itemCount.containsKey(item)) {
                        itemCount.put(item, itemCount.get(item) + 1);
                    } else {
                        itemCount.put(item, 1);
                    }
                }
            }

            scanner.close();

            // convert hashmap to list so we can sort it
            ArrayList<Map.Entry<String, Integer>> sortedList =
                    new ArrayList<>(itemCount.entrySet());

            // sorting based on count (descending)
            Collections.sort(sortedList, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> a,
                                   Map.Entry<String, Integer> b) {
                    return b.getValue() - a.getValue();
                }
            });

            // printing only top 3
            for (int i = 0; i < 3 && i < sortedList.size(); i++) {
                Map.Entry<String, Integer> entry = sortedList.get(i);
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }

        } catch (Exception e) {
            System.out.println("File not found.");
        }
    }
}
