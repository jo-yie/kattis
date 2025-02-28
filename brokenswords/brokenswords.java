package brokenswords;

import java.util.Scanner;

public class brokenswords {

    public static void main(String[] args) {

        int tbCount = 0; 
        int lrCount =  0;

        Scanner scanner = new Scanner(System.in);
        int numSwords = scanner.nextInt(); 

        scanner.nextLine();

        for (int i = 0; i < numSwords; i++) {

            String sword = scanner.nextLine();

            for (Integer j = 0; j < 4; j++) {
                
                if (Integer.valueOf(sword.substring(j, j + 1)).equals(0)) {
                    if (j.equals(0) || j.equals(1)) {
                        tbCount++;
                    } else if (j.equals(2) || j.equals(3)) {
                        lrCount++;
                    }
                } 

            }

        }

        scanner.close();

        int counter = 0; 
        
        while (tbCount >= 2 && lrCount >= 2) {
            tbCount = tbCount - 2; 
            lrCount = lrCount - 2; 
            counter++;
        }

        System.out.printf("%d %d %d\n", counter, tbCount, lrCount);

    }
    
}
