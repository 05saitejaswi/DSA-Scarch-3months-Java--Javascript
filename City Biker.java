import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of elements
        int n = scanner.nextInt();
        int[] gain = new int[n];
        
        // Read the gain values
        for (int i = 0; i < n; i++) {
            gain[i] = scanner.nextInt();
        }
        
        // Initialize variables
        int currentAltitude = 0;
        int highestAltitude = 0;
        
        // Calculate the highest altitude
        for (int i = 0; i < n; i++) {
            currentAltitude += gain[i];
            if (currentAltitude > highestAltitude) {
                highestAltitude = currentAltitude;
            }
        }
        
        // Output the highest altitude
        System.out.println(highestAltitude);
        
        scanner.close();
    }
}
