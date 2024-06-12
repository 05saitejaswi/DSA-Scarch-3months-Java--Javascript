import java.io.*;
import java.util.*;

public class Solution {

    // Function to calculate absolute difference
    public static int calculateAbsoluteDifference(int[][] queries) {
        // HashMap to store counts of each number
        Map<Integer, Integer> counts = new HashMap<>();
        
        // Iterate through each query
        for (int[] query : queries) {
            int a = query[0];
            int b = query[1];
            counts.put(b, counts.getOrDefault(b, 0) + a);
        }
        
        // Find maximum and minimum occurrences
        int maxOccurrences = Collections.max(counts.values());
        int minOccurrences = Collections.min(counts.values());
        
        // Calculate absolute difference
        return maxOccurrences - minOccurrences;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt(); // Number of queries
        int[][] queries = new int[q][2];
        
        // Reading the queries
        for (int i = 0; i < q; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
        }
        
        // Calculate and print the absolute difference
        int result = calculateAbsoluteDifference(queries);
        System.out.println(result);
    }
}
