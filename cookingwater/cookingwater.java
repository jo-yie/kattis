package cookingwater;

import java.util.Scanner;

public class cookingwater {

    static int[][] intList;
    static int count;

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        count = scanner.nextInt(); 
        intList = new int[count][2];

        scanner.nextLine(); 

        for (int i = 0; i < count; i++) {

            String interval = scanner.nextLine();
            String[] temp = interval.split(" ");

            intList[i][0] = Integer.valueOf(temp[0]);
            intList[i][1] = Integer.valueOf(temp[1]);

        }

        scanner.close(); 

        whoIsRight();

    }

    public static void whoIsRight() { 

        int low = intList[0][0]; 
        int high = intList[0][1];

        for (int k = 1; k < count; k++) {

            int lowNew = intList[k][0]; 
            int highNew = intList[k][1];

            low = Math.max(low, lowNew);
            high = Math.min(high, highNew);

            if (high - low < 0) {
                System.out.println("edward is right");
                return; 

            }

        }

        System.out.println("gunilla has a point");

    }
    
}
