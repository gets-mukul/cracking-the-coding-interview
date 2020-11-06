public class IsUnique {
    /**
     * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
     * cannot use additional data structures?
     */

    private final String input = "hello";

    // Space -> O(1), Time -> O(n2)
    public void checkForUnique_1() {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    System.out.println("No! input does not have all the unique characters");
                    return;
                }
            }
        }
        System.out.println("Yes! input have all the unique characters");
    }

    // Space -> O(n), Time -> O(m)
    // assuming string will contain only lowercase and no special character
    public void checkForUnique_2() {
        final Boolean[] arr = new Boolean[26];
        for (int i = 0; i < input.length(); i++) {
            final int index = input.charAt(i) - 97;
            if (Boolean.TRUE == arr[index]) {
                System.out.println("No! input does not have all the unique characters");
                return;
            } else {
                arr[index] = Boolean.TRUE;
            }
        }
        System.out.println("Yes! input have all the unique characters");
    }

    // Space -> O(1), Time -> O(n)
    // assuming string will contain only lowercase and no special character
    public void checkForUnique_3() {
        int storage = 1;
        for (int i = 0; i < input.length(); i++) {
            int ascii = input.charAt(i) - 'a';
            if ((storage & (1 << ascii)) > 0) {
                System.out.println("No! input does not have all the unique characters");
                return;
            } else {
                storage = storage | 1 << ascii;
            }
        }
        System.out.println("Yes! input have all the unique characters");
    }
}
