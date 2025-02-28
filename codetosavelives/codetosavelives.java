package codetosavelives;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codetosavelives {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 

        int numTestCases = scanner.nextInt(); 

        scanner.nextLine();

        for (int i = 0; i < numTestCases; i++) {

            List<Integer> numArray = new ArrayList<>(); 

            for (int j = 0; j < 2; j++) {

                String numRaw = scanner.nextLine(); 
                String[] numList = numRaw.split(" ");
                String numString = "";
                for (String s: numList) {
                    numString = numString + s; 
                }
    
                int num = Integer.valueOf(numString);
                numArray.add(num);

            }

            int ans = 0;
            for (int k : numArray) {
                ans = ans + k; 
            }

            String stringAns = String.valueOf(ans);
            String[] finalAns = new String[stringAns.length()];
            for (int k = 0; k < stringAns.length(); k++) {
                finalAns[k] = String.valueOf(stringAns.charAt(k));
            }

            System.out.println(String.join(" ", finalAns));

        }

        scanner.close(); 

    }
    
}
