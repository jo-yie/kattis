package areal;

import java.util.Scanner;

public class areal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 

        long input = scanner.nextLong(); 

        scanner.close(); 

        double squareRoot = Math.sqrt(input);

        double ans = squareRoot * 4; 

        System.out.printf("%.6f\n", ans);

    }
    
}
