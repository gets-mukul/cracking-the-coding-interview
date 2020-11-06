import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {

    /**
     * Check Permutation: Given two strings, write a method to decide if one is a permutation of the
     * other.
     */

    private final String input1 = "hello";
    private final String input2 = "hello";

    // Space O(1), time O(n log n + n)
    public void checkPermutation_1() {
        // one way is to sort both the string and check char by char
    }

    // SSpace O(n), time O(n)
    public void checkPermutation_2() {
        if (input1.length() != input2.length()) {
            System.out.println("Input 1 is not a permutation of input 2");
            return;
        }
        final Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        for (int i = 0; i < input1.length(); i++) {
            if (charCountMap.containsKey(input1.charAt(i))) {
                int previousCount = charCountMap.get(input1.charAt(i));
                charCountMap.put(input1.charAt(i), previousCount + 1);
            } else {
                charCountMap.put(input1.charAt(i), 1);
            }
        }

        for (int i = 0; i < input2.length(); i++) {
            if (charCountMap.containsKey(input2.charAt(i))) {
                int previousCount = charCountMap.get(input2.charAt(i));
                if ((previousCount - 1) <= 0) {
                    charCountMap.remove(input2.charAt(i));
                } else {
                    charCountMap.put(input2.charAt(i), previousCount - 1);
                }
            } else {
                System.out.println("Input 1 is not a permutation of input 2");
                return;
            }
        }

        if (charCountMap.isEmpty()) {
            System.out.println("Yes! Input 1 is a permutation of input 2");
        } else {
            System.out.println("Input 1 is not a permutation of input 2");
        }
    }
}
