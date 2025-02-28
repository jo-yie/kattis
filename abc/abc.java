package abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class abc {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            nums.add(scanner.nextInt());
        }

        Collections.sort(nums);

        String order = scanner.next();

        scanner.close();

        Map<Character, Integer> abcMap = new HashMap<>(); 
        abcMap.put('A', nums.get(0));
        abcMap.put('B', nums.get(1)); 
        abcMap.put('C', nums.get(2));

        String output = abcMap.get(order.charAt(0)) + " "
            + abcMap.get(order.charAt(1)) + " "
            + abcMap.get(order.charAt(2));

        System.out.println(output);

    }
    
}
