import java.util.*;

public class Part2_TicketCategories {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
System.out.println("Enter 10 ticket categories:");
        ArrayList<String> allTickets = new ArrayList<>();
        HashSet<String> uniqueTickets = new HashSet<>();
        HashMap<String, Integer> countMap = new HashMap<>();

        // reading 10 ticket category inputs
        for (int i = 0; i < 10; i++) {
            String type = scanner.nextLine();

            allTickets.add(type);
            uniqueTickets.add(type);

            // counting how many times a ticket appears
            if (countMap.containsKey(type)) {
                countMap.put(type, countMap.get(type) + 1);
            } else {
                countMap.put(type, 1);
            }
        }

        System.out.println("ArrayList: " + allTickets);
        System.out.println("HashSet: " + uniqueTickets);
        System.out.println("HashMap: " + countMap);

        scanner.close();
    }
}
