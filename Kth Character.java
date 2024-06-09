Problem Statement
One day jack finds a string of characters. He is very keen to arrange the characters in reverse order, i.e., first characters become the last characters, second characters become the second-last characters, and so on.

Now he wants your help  to find the kth character from the new string formed after reverse the original string.

Input Format
The first line contains two integers n, k — the length of array and the value of k respectively.
The second line contains a string containing n characters.
Output Format
Print a single line containing the kth character of the string.

Constraints
1 ≤ k ≤ n≤ 1000000
String contain only lowercase Latin letters.
Sample Testcase 0
Testcase Input
5 2
abdfa
Testcase Output
f
Explanation
The reversed string is:"afdba"


The 2nd character after the reversing the string is f.

Sample Testcase 1
Testcase Input
4 4
bbxn
Testcase Output
b
Explanation
The reveresed string will be: "nxbb"


The 4th character after the reversing the string is b.

Topics
String
Math
Strings





----------------------------------------
import java.io.*;
import java.util.*;

class Kth Character {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input values
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        String originalString = scanner.nextLine();

        // Reverse the string
        String reversedString = new StringBuilder(originalString).reverse().toString();

        // Output the k-th character of the reversed string
        System.out.println(reversedString.charAt(k - 1));
    }
}
