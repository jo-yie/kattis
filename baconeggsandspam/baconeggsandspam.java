package baconeggsandspam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class baconeggsandspam {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {

            int numDiners = scanner.nextInt(); 
            scanner.nextLine();

            if (numDiners == 0) {
                break;
            }

            Map<String, List<String>> dailyReport = new HashMap<>();

            for (int i = 0; i < numDiners; i++) {

                String line = scanner.nextLine();
                String[] lineList = line.split(" ");

                String customer = lineList[0];

                for (int j = 1; j < lineList.length; j++) {

                    String menuItem = lineList[j];

                    dailyReport.putIfAbsent(menuItem, new ArrayList<>());

                    if (!dailyReport.get(menuItem).contains(customer)) {
                        dailyReport.get(menuItem).add(customer);
                    }

                }

            }

            List<String> sortedFoodItems = new ArrayList<>(dailyReport.keySet());
            Collections.sort(sortedFoodItems);

            for (String food: sortedFoodItems) {
                List<String> customers = dailyReport.get(food);
                Collections.sort(customers); 
                System.out.println(food + " " + String.join(" ", customers));
            }

        }

        scanner.close();

    }
    
}
