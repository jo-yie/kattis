package countdoubles;

import java.util.Scanner;

public class countdoubles {

    public static void main(String[] args) {

        int subArrayCount = 0; 
        
        Scanner scanner = new Scanner(System.in); 
        int lenArray = scanner.nextInt(); 
        int lenSubArray = scanner.nextInt(); 

        scanner.nextLine(); 

        String temp = scanner.nextLine(); 
        String[] tempArray = temp.split(" ");

        scanner.close(); 

        // for each num in array 
        for (int i = 0; i < lenArray - (lenSubArray - 1); i++) {

            int evenCount = 0; 

            int start = i;

            for (int j = start; j < lenSubArray + start; j++) {

                if (Integer.valueOf(tempArray[j]) % 2 == 0) {

                    evenCount++; 

                }

            }

            if (evenCount >= 2) {
                subArrayCount++;
            }

        }

        System.out.println(subArrayCount);

    }
    
}
